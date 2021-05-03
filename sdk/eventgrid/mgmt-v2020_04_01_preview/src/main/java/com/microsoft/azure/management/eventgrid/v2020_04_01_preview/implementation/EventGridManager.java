/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.Domains;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.DomainTopics;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.EventChannels;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.EventSubscriptions;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.SystemTopicEventSubscriptions;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerTopicEventSubscriptions;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.Operations;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerNamespaces;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerRegistrations;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerTopics;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PrivateEndpointConnections;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PrivateLinkResources;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.SystemTopics;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.Topics;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.ExtensionTopics;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.TopicTypes;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure EventGrid resource management.
 */
public final class EventGridManager extends ManagerCore<EventGridManager, EventGridManagementClientImpl> {
    private Domains domains;
    private DomainTopics domainTopics;
    private EventChannels eventChannels;
    private EventSubscriptions eventSubscriptions;
    private SystemTopicEventSubscriptions systemTopicEventSubscriptions;
    private PartnerTopicEventSubscriptions partnerTopicEventSubscriptions;
    private Operations operations;
    private PartnerNamespaces partnerNamespaces;
    private PartnerRegistrations partnerRegistrations;
    private PartnerTopics partnerTopics;
    private PrivateEndpointConnections privateEndpointConnections;
    private PrivateLinkResources privateLinkResources;
    private SystemTopics systemTopics;
    private Topics topics;
    private ExtensionTopics extensionTopics;
    private TopicTypes topicTypes;
    /**
    * Get a Configurable instance that can be used to create EventGridManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new EventGridManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of EventGridManager that exposes EventGrid resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the EventGridManager
    */
    public static EventGridManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new EventGridManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of EventGridManager that exposes EventGrid resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the EventGridManager
    */
    public static EventGridManager authenticate(RestClient restClient, String subscriptionId) {
        return new EventGridManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of EventGridManager that exposes EventGrid management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing EventGrid management API entry points that work across subscriptions
        */
        EventGridManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Domains.
     */
    public Domains domains() {
        if (this.domains == null) {
            this.domains = new DomainsImpl(this);
        }
        return this.domains;
    }

    /**
     * @return Entry point to manage DomainTopics.
     */
    public DomainTopics domainTopics() {
        if (this.domainTopics == null) {
            this.domainTopics = new DomainTopicsImpl(this);
        }
        return this.domainTopics;
    }

    /**
     * @return Entry point to manage EventChannels.
     */
    public EventChannels eventChannels() {
        if (this.eventChannels == null) {
            this.eventChannels = new EventChannelsImpl(this);
        }
        return this.eventChannels;
    }

    /**
     * @return Entry point to manage EventSubscriptions.
     */
    public EventSubscriptions eventSubscriptions() {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new EventSubscriptionsImpl(this);
        }
        return this.eventSubscriptions;
    }

    /**
     * @return Entry point to manage SystemTopicEventSubscriptions.
     */
    public SystemTopicEventSubscriptions systemTopicEventSubscriptions() {
        if (this.systemTopicEventSubscriptions == null) {
            this.systemTopicEventSubscriptions = new SystemTopicEventSubscriptionsImpl(this);
        }
        return this.systemTopicEventSubscriptions;
    }

    /**
     * @return Entry point to manage PartnerTopicEventSubscriptions.
     */
    public PartnerTopicEventSubscriptions partnerTopicEventSubscriptions() {
        if (this.partnerTopicEventSubscriptions == null) {
            this.partnerTopicEventSubscriptions = new PartnerTopicEventSubscriptionsImpl(this);
        }
        return this.partnerTopicEventSubscriptions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage PartnerNamespaces.
     */
    public PartnerNamespaces partnerNamespaces() {
        if (this.partnerNamespaces == null) {
            this.partnerNamespaces = new PartnerNamespacesImpl(this);
        }
        return this.partnerNamespaces;
    }

    /**
     * @return Entry point to manage PartnerRegistrations.
     */
    public PartnerRegistrations partnerRegistrations() {
        if (this.partnerRegistrations == null) {
            this.partnerRegistrations = new PartnerRegistrationsImpl(this);
        }
        return this.partnerRegistrations;
    }

    /**
     * @return Entry point to manage PartnerTopics.
     */
    public PartnerTopics partnerTopics() {
        if (this.partnerTopics == null) {
            this.partnerTopics = new PartnerTopicsImpl(this);
        }
        return this.partnerTopics;
    }

    /**
     * @return Entry point to manage PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections = new PrivateEndpointConnectionsImpl(this);
        }
        return this.privateEndpointConnections;
    }

    /**
     * @return Entry point to manage PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(this);
        }
        return this.privateLinkResources;
    }

    /**
     * @return Entry point to manage SystemTopics.
     */
    public SystemTopics systemTopics() {
        if (this.systemTopics == null) {
            this.systemTopics = new SystemTopicsImpl(this);
        }
        return this.systemTopics;
    }

    /**
     * @return Entry point to manage Topics.
     */
    public Topics topics() {
        if (this.topics == null) {
            this.topics = new TopicsImpl(this);
        }
        return this.topics;
    }

    /**
     * @return Entry point to manage ExtensionTopics.
     */
    public ExtensionTopics extensionTopics() {
        if (this.extensionTopics == null) {
            this.extensionTopics = new ExtensionTopicsImpl(this);
        }
        return this.extensionTopics;
    }

    /**
     * @return Entry point to manage TopicTypes.
     */
    public TopicTypes topicTypes() {
        if (this.topicTypes == null) {
            this.topicTypes = new TopicTypesImpl(this);
        }
        return this.topicTypes;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public EventGridManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return EventGridManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private EventGridManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new EventGridManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}