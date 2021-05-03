// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for using a user's KeyVault certificate for securing custom domain. */
@Fluent
public final class KeyVaultCertificateSourceParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultCertificateSourceParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * Subscription Id of the user's Key Vault containing the SSL certificate
     */
    @JsonProperty(value = "subscriptionId", required = true)
    private String subscriptionId;

    /*
     * Resource group of the user's Key Vault containing the SSL certificate
     */
    @JsonProperty(value = "resourceGroupName", required = true)
    private String resourceGroupName;

    /*
     * The name of the user's Key Vault containing the SSL certificate
     */
    @JsonProperty(value = "vaultName", required = true)
    private String vaultName;

    /*
     * The name of Key Vault Secret (representing the full certificate PFX) in
     * Key Vault.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /*
     * The version(GUID) of Key Vault Secret in Key Vault.
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /*
     * Describes the action that shall be taken when the certificate is updated
     * in Key Vault.
     */
    @JsonProperty(value = "updateRule", required = true)
    private UpdateRule updateRule;

    /*
     * Describes the action that shall be taken when the certificate is removed
     * from Key Vault.
     */
    @JsonProperty(value = "deleteRule", required = true)
    private DeleteRule deleteRule;

    /** Creates an instance of KeyVaultCertificateSourceParameters class. */
    public KeyVaultCertificateSourceParameters() {
        odataType = "#Microsoft.Azure.Cdn.Models.KeyVaultCertificateSourceParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id of the user's Key Vault containing the SSL certificate.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id of the user's Key Vault containing the SSL certificate.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Resource group of the user's Key Vault containing the SSL certificate.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Resource group of the user's Key Vault containing the SSL certificate.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the vaultName property: The name of the user's Key Vault containing the SSL certificate.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: The name of the user's Key Vault containing the SSL certificate.
     *
     * @param vaultName the vaultName value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the secretName property: The name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     *
     * @param secretName the secretName value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The version(GUID) of Key Vault Secret in Key Vault.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The version(GUID) of Key Vault Secret in Key Vault.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get the updateRule property: Describes the action that shall be taken when the certificate is updated in Key
     * Vault.
     *
     * @return the updateRule value.
     */
    public UpdateRule updateRule() {
        return this.updateRule;
    }

    /**
     * Set the updateRule property: Describes the action that shall be taken when the certificate is updated in Key
     * Vault.
     *
     * @param updateRule the updateRule value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withUpdateRule(UpdateRule updateRule) {
        this.updateRule = updateRule;
        return this;
    }

    /**
     * Get the deleteRule property: Describes the action that shall be taken when the certificate is removed from Key
     * Vault.
     *
     * @return the deleteRule value.
     */
    public DeleteRule deleteRule() {
        return this.deleteRule;
    }

    /**
     * Set the deleteRule property: Describes the action that shall be taken when the certificate is removed from Key
     * Vault.
     *
     * @param deleteRule the deleteRule value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withDeleteRule(DeleteRule deleteRule) {
        this.deleteRule = deleteRule;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptionId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subscriptionId in model KeyVaultCertificateSourceParameters"));
        }
        if (resourceGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceGroupName in model KeyVaultCertificateSourceParameters"));
        }
        if (vaultName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vaultName in model KeyVaultCertificateSourceParameters"));
        }
        if (secretName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretName in model KeyVaultCertificateSourceParameters"));
        }
        if (updateRule() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property updateRule in model KeyVaultCertificateSourceParameters"));
        }
        if (deleteRule() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deleteRule in model KeyVaultCertificateSourceParameters"));
        }
    }
}