// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters used when creating a storage account. */
@JsonFlatten
@Fluent
public class StorageAccountCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountCreateParameters.class);

    /*
     * Required. Gets or sets the SKU name.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Required. Indicates the type of storage account.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /*
     * Required. Gets or sets the location of the resource. This will be one of
     * the supported and registered Azure Geo Regions (e.g. West US, East US,
     * Southeast Asia, etc.). The geo region of a resource cannot be changed
     * once it is created, but if an identical geo region is specified on
     * update, the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Optional. Set the extended location of the resource. If not set, the
     * storage account will be created in Azure main region. Otherwise it will
     * be created in the specified extended location
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used for viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key with a length no greater than 128 characters and a value
     * with a length no greater than 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * SasPolicy assigned to the storage account.
     */
    @JsonProperty(value = "properties.sasPolicy")
    private SasPolicy sasPolicy;

    /*
     * KeyPolicy assigned to the storage account.
     */
    @JsonProperty(value = "properties.keyPolicy")
    private KeyPolicy keyPolicy;

    /*
     * User domain assigned to the storage account. Name is the CNAME source.
     * Only one custom domain is supported per storage account at this time. To
     * clear the existing custom domain, use an empty string for the custom
     * domain name property.
     */
    @JsonProperty(value = "properties.customDomain")
    private CustomDomain customDomain;

    /*
     * Not applicable. Azure Storage encryption is enabled for all storage
     * accounts and cannot be disabled.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /*
     * Network rule set
     */
    @JsonProperty(value = "properties.networkAcls")
    private NetworkRuleSet networkRuleSet;

    /*
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing.
     */
    @JsonProperty(value = "properties.accessTier")
    private AccessTier accessTier;

    /*
     * Provides the identity based authentication settings for Azure Files.
     */
    @JsonProperty(value = "properties.azureFilesIdentityBasedAuthentication")
    private AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication;

    /*
     * Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /*
     * Account HierarchicalNamespace enabled if sets to true.
     */
    @JsonProperty(value = "properties.isHnsEnabled")
    private Boolean isHnsEnabled;

    /*
     * Allow large file shares if sets to Enabled. It cannot be disabled once
     * it is enabled.
     */
    @JsonProperty(value = "properties.largeFileSharesState")
    private LargeFileSharesState largeFileSharesState;

    /*
     * Maintains information about the network routing choice opted by the user
     * for data transfer
     */
    @JsonProperty(value = "properties.routingPreference")
    private RoutingPreference routingPreference;

    /*
     * Allow or disallow public access to all blobs or containers in the
     * storage account. The default interpretation is true for this property.
     */
    @JsonProperty(value = "properties.allowBlobPublicAccess")
    private Boolean allowBlobPublicAccess;

    /*
     * Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     */
    @JsonProperty(value = "properties.minimumTlsVersion")
    private MinimumTlsVersion minimumTlsVersion;

    /*
     * Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests,
     * including shared access signatures, must be authorized with Azure Active
     * Directory (Azure AD). The default value is null, which is equivalent to
     * true.
     */
    @JsonProperty(value = "properties.allowSharedKeyAccess")
    private Boolean allowSharedKeyAccess;

    /*
     * NFS 3.0 protocol support enabled if set to true.
     */
    @JsonProperty(value = "properties.isNfsV3Enabled")
    private Boolean enableNfsV3;

    /**
     * Get the sku property: Required. Gets or sets the SKU name.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Required. Gets or sets the SKU name.
     *
     * @param sku the sku value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Required. Indicates the type of storage account.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Required. Indicates the type of storage account.
     *
     * @param kind the kind value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     *
     * @param location the location value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the extendedLocation property: Optional. Set the extended location of the resource. If not set, the storage
     * account will be created in Azure main region. Otherwise it will be created in the specified extended location.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Optional. Set the extended location of the resource. If not set, the storage
     * account will be created in Azure main region. Otherwise it will be created in the specified extended location.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     *
     * @param tags the tags value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sasPolicy property: SasPolicy assigned to the storage account.
     *
     * @return the sasPolicy value.
     */
    public SasPolicy sasPolicy() {
        return this.sasPolicy;
    }

    /**
     * Set the sasPolicy property: SasPolicy assigned to the storage account.
     *
     * @param sasPolicy the sasPolicy value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withSasPolicy(SasPolicy sasPolicy) {
        this.sasPolicy = sasPolicy;
        return this;
    }

    /**
     * Get the keyPolicy property: KeyPolicy assigned to the storage account.
     *
     * @return the keyPolicy value.
     */
    public KeyPolicy keyPolicy() {
        return this.keyPolicy;
    }

    /**
     * Set the keyPolicy property: KeyPolicy assigned to the storage account.
     *
     * @param keyPolicy the keyPolicy value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withKeyPolicy(KeyPolicy keyPolicy) {
        this.keyPolicy = keyPolicy;
        return this;
    }

    /**
     * Get the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption property: Not applicable. Azure Storage encryption is enabled for all storage accounts and
     * cannot be disabled.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Not applicable. Azure Storage encryption is enabled for all storage accounts and
     * cannot be disabled.
     *
     * @param encryption the encryption value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

    /**
     * Get the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @return the isHnsEnabled value.
     */
    public Boolean isHnsEnabled() {
        return this.isHnsEnabled;
    }

    /**
     * Set the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @param isHnsEnabled the isHnsEnabled value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIsHnsEnabled(Boolean isHnsEnabled) {
        this.isHnsEnabled = isHnsEnabled;
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.largeFileSharesState;
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        this.largeFileSharesState = largeFileSharesState;
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.routingPreference;
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withRoutingPreference(RoutingPreference routingPreference) {
        this.routingPreference = routingPreference;
        return this;
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.allowBlobPublicAccess;
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @return the allowSharedKeyAccess value.
     */
    public Boolean allowSharedKeyAccess() {
        return this.allowSharedKeyAccess;
    }

    /**
     * Set the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @param allowSharedKeyAccess the allowSharedKeyAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        this.allowSharedKeyAccess = allowSharedKeyAccess;
        return this;
    }

    /**
     * Get the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     *
     * @return the enableNfsV3 value.
     */
    public Boolean enableNfsV3() {
        return this.enableNfsV3;
    }

    /**
     * Set the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     *
     * @param enableNfsV3 the enableNfsV3 value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableNfsV3(Boolean enableNfsV3) {
        this.enableNfsV3 = enableNfsV3;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sku in model StorageAccountCreateParameters"));
        } else {
            sku().validate();
        }
        if (kind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kind in model StorageAccountCreateParameters"));
        }
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model StorageAccountCreateParameters"));
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (sasPolicy() != null) {
            sasPolicy().validate();
        }
        if (keyPolicy() != null) {
            keyPolicy().validate();
        }
        if (customDomain() != null) {
            customDomain().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (azureFilesIdentityBasedAuthentication() != null) {
            azureFilesIdentityBasedAuthentication().validate();
        }
        if (routingPreference() != null) {
            routingPreference().validate();
        }
    }
}