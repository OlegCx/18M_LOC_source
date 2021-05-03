/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * The azure blob storage linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureBlobStorageLinkedService.class)
@JsonTypeName("AzureBlobStorage")
@JsonFlatten
public class AzureBlobStorageLinkedService extends LinkedServiceInner {
    /**
     * The connection string. It is mutually exclusive with sasUri,
     * serviceEndpoint property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private AzureKeyVaultSecretReference accountKey;

    /**
     * SAS URI of the Azure Blob Storage resource. It is mutually exclusive
     * with connectionString, serviceEndpoint property. Type: string,
     * SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.sasUri")
    private Object sasUri;

    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    @JsonProperty(value = "typeProperties.sasToken")
    private AzureKeyVaultSecretReference sasToken;

    /**
     * Blob service endpoint of the Azure Blob Storage resource. It is mutually
     * exclusive with connectionString, sasUri property.
     */
    @JsonProperty(value = "typeProperties.serviceEndpoint")
    private String serviceEndpoint;

    /**
     * The ID of the service principal used to authenticate against Azure SQL
     * Data Warehouse. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The key of the service principal used to authenticate against Azure SQL
     * Data Warehouse.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed
     * values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany.
     * Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.azureCloudType")
    private Object azureCloudType;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private String encryptedCredential;

    /**
     * Get the connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value
     */
    public AzureKeyVaultSecretReference accountKey() {
        return this.accountKey;
    }

    /**
     * Set the Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get sAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value
     */
    public Object sasUri() {
        return this.sasUri;
    }

    /**
     * Set sAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value
     */
    public AzureKeyVaultSecretReference sasToken() {
        return this.sasToken;
    }

    /**
     * Set the Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri property.
     *
     * @return the serviceEndpoint value
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the key of the service principal used to authenticate against Azure SQL Data Warehouse.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the key of the service principal used to authenticate against Azure SQL Data Warehouse.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value
     */
    public Object azureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}