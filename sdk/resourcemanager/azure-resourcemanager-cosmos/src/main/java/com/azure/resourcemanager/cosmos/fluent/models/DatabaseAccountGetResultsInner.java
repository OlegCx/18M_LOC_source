// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ApiProperties;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.BackupPolicy;
import com.azure.resourcemanager.cosmos.models.Capability;
import com.azure.resourcemanager.cosmos.models.ConnectorOffer;
import com.azure.resourcemanager.cosmos.models.ConsistencyPolicy;
import com.azure.resourcemanager.cosmos.models.CorsPolicy;
import com.azure.resourcemanager.cosmos.models.DatabaseAccountKind;
import com.azure.resourcemanager.cosmos.models.DatabaseAccountOfferType;
import com.azure.resourcemanager.cosmos.models.FailoverPolicy;
import com.azure.resourcemanager.cosmos.models.IpAddressOrRange;
import com.azure.resourcemanager.cosmos.models.Location;
import com.azure.resourcemanager.cosmos.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.models.NetworkAclBypass;
import com.azure.resourcemanager.cosmos.models.PublicNetworkAccess;
import com.azure.resourcemanager.cosmos.models.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An Azure Cosmos DB database account. */
@JsonFlatten
@Fluent
public class DatabaseAccountGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountGetResultsInner.class);

    /*
     * Indicates the type of database account. This can only be set at database
     * account creation.
     */
    @JsonProperty(value = "kind")
    private DatabaseAccountKind kind;

    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * The status of the Cosmos DB account at the time the operation was
     * called. The status can be one of following. 'Creating' – the Cosmos DB
     * account is being created. When an account is in Creating state, only
     * properties that are specified as input for the Create Cosmos DB account
     * operation are returned. 'Succeeded' – the Cosmos DB account is active
     * for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting'
     * – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB
     * account failed creation. 'DeletionFailed' – the Cosmos DB account
     * deletion failed.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The connection endpoint for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.documentEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String documentEndpoint;

    /*
     * The offer type for the Cosmos DB database account. Default value:
     * Standard.
     */
    @JsonProperty(value = "properties.databaseAccountOfferType", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseAccountOfferType databaseAccountOfferType;

    /*
     * List of IpRules.
     */
    @JsonProperty(value = "properties.ipRules")
    private List<IpAddressOrRange> ipRules;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * The consistency policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /*
     * An array that contains the write location for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.writeLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> writeLocations;

    /*
     * An array that contains of the read locations enabled for the Cosmos DB
     * account.
     */
    @JsonProperty(value = "properties.readLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> readLocations;

    /*
     * An array that contains all of the locations enabled for the Cosmos DB
     * account.
     */
    @JsonProperty(value = "properties.locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> locations;

    /*
     * An array that contains the regions ordered by their failover priorities.
     */
    @JsonProperty(value = "properties.failoverPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<FailoverPolicy> failoverPolicies;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * List of Private Endpoint Connections configured for the Cosmos DB
     * account.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "properties.enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "properties.enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C*
     * account.
     */
    @JsonProperty(value = "properties.connectorOffer")
    private ConnectorOffer connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers,
     * throughput) via account keys
     */
    @JsonProperty(value = "properties.disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /*
     * The URI of the key vault
     */
    @JsonProperty(value = "properties.keyVaultKeyUri")
    private String keyVaultKeyUri;

    /*
     * The default identity for accessing key vault used in features like
     * customer managed keys. The default identity needs to be explicitly set
     * by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity"
     * and more.
     */
    @JsonProperty(value = "properties.defaultIdentity")
    private String defaultIdentity;

    /*
     * Whether requests from Public Network are allowed
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Flag to indicate whether Free Tier is enabled.
     */
    @JsonProperty(value = "properties.enableFreeTier")
    private Boolean enableFreeTier;

    /*
     * API specific properties.
     */
    @JsonProperty(value = "properties.apiProperties")
    private ApiProperties apiProperties;

    /*
     * Flag to indicate whether to enable storage analytics.
     */
    @JsonProperty(value = "properties.enableAnalyticalStorage")
    private Boolean enableAnalyticalStorage;

    /*
     * The object representing the policy for taking backups on an account.
     */
    @JsonProperty(value = "properties.backupPolicy")
    private BackupPolicy backupPolicy;

    /*
     * The CORS policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.cors")
    private List<CorsPolicy> cors;

    /*
     * Indicates what services are allowed to bypass firewall checks.
     */
    @JsonProperty(value = "properties.networkAclBypass")
    private NetworkAclBypass networkAclBypass;

    /*
     * An array that contains the Resource Ids for Network Acl Bypass for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "properties.networkAclBypassResourceIds")
    private List<String> networkAclBypassResourceIds;

    /**
     * Get the kind property: Indicates the type of database account. This can only be set at database account creation.
     *
     * @return the kind value.
     */
    public DatabaseAccountKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Indicates the type of database account. This can only be set at database account creation.
     *
     * @param kind the kind value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withKind(DatabaseAccountKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the Cosmos DB account at the time the operation was called. The
     * status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in
     * Creating state, only properties that are specified as input for the Create Cosmos DB account operation are
     * returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being
     * updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation.
     * 'DeletionFailed' – the Cosmos DB account deletion failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the documentEndpoint property: The connection endpoint for the Cosmos DB database account.
     *
     * @return the documentEndpoint value.
     */
    public String documentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * Get the databaseAccountOfferType property: The offer type for the Cosmos DB database account. Default value:
     * Standard.
     *
     * @return the databaseAccountOfferType value.
     */
    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<IpAddressOrRange> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withIpRules(List<IpAddressOrRange> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the writeLocations property: An array that contains the write location for the Cosmos DB account.
     *
     * @return the writeLocations value.
     */
    public List<Location> writeLocations() {
        return this.writeLocations;
    }

    /**
     * Get the readLocations property: An array that contains of the read locations enabled for the Cosmos DB account.
     *
     * @return the readLocations value.
     */
    public List<Location> readLocations() {
        return this.readLocations;
    }

    /**
     * Get the locations property: An array that contains all of the locations enabled for the Cosmos DB account.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Get the failoverPolicies property: An array that contains the regions ordered by their failover priorities.
     *
     * @return the failoverPolicies value.
     */
    public List<FailoverPolicy> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of Private Endpoint Connections configured for the Cosmos DB
     * account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Get the keyVaultKeyUri property: The URI of the key vault.
     *
     * @return the keyVaultKeyUri value.
     */
    public String keyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }

    /**
     * Set the keyVaultKeyUri property: The URI of the key vault.
     *
     * @param keyVaultKeyUri the keyVaultKeyUri value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        return this;
    }

    /**
     * Get the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @return the defaultIdentity value.
     */
    public String defaultIdentity() {
        return this.defaultIdentity;
    }

    /**
     * Set the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @param defaultIdentity the defaultIdentity value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withDefaultIdentity(String defaultIdentity) {
        this.defaultIdentity = defaultIdentity;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value.
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }

    /**
     * Set the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @param enableFreeTier the enableFreeTier value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableFreeTier(Boolean enableFreeTier) {
        this.enableFreeTier = enableFreeTier;
        return this;
    }

    /**
     * Get the apiProperties property: API specific properties.
     *
     * @return the apiProperties value.
     */
    public ApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the apiProperties property: API specific properties.
     *
     * @param apiProperties the apiProperties value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withApiProperties(ApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value.
     */
    public Boolean enableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }

    /**
     * Set the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        return this;
    }

    /**
     * Get the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @return the backupPolicy value.
     */
    public BackupPolicy backupPolicy() {
        return this.backupPolicy;
    }

    /**
     * Set the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @param backupPolicy the backupPolicy value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    /**
     * Get the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @return the cors value.
     */
    public List<CorsPolicy> cors() {
        return this.cors;
    }

    /**
     * Set the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @param cors the cors value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withCors(List<CorsPolicy> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @return the networkAclBypass value.
     */
    public NetworkAclBypass networkAclBypass() {
        return this.networkAclBypass;
    }

    /**
     * Set the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @param networkAclBypass the networkAclBypass value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        this.networkAclBypass = networkAclBypass;
        return this;
    }

    /**
     * Get the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @return the networkAclBypassResourceIds value.
     */
    public List<String> networkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds;
    }

    /**
     * Set the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @param networkAclBypassResourceIds the networkAclBypassResourceIds value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withNetworkAclBypassResourceIds(List<String> networkAclBypassResourceIds) {
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabaseAccountGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabaseAccountGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (identity() != null) {
            identity().validate();
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (consistencyPolicy() != null) {
            consistencyPolicy().validate();
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (writeLocations() != null) {
            writeLocations().forEach(e -> e.validate());
        }
        if (readLocations() != null) {
            readLocations().forEach(e -> e.validate());
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (failoverPolicies() != null) {
            failoverPolicies().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (apiProperties() != null) {
            apiProperties().validate();
        }
        if (backupPolicy() != null) {
            backupPolicy().validate();
        }
        if (cors() != null) {
            cors().forEach(e -> e.validate());
        }
    }
}