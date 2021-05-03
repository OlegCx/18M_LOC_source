// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Certificate resource payload. */
@Fluent
public final class CertificateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateProperties.class);

    /*
     * The thumbprint of certificate.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * The vault uri of user key vault.
     */
    @JsonProperty(value = "vaultUri", required = true)
    private String vaultUri;

    /*
     * The certificate name of key vault.
     */
    @JsonProperty(value = "keyVaultCertName", required = true)
    private String keyVaultCertName;

    /*
     * The certificate version of key vault.
     */
    @JsonProperty(value = "certVersion")
    private String certVersion;

    /*
     * The issuer of certificate.
     */
    @JsonProperty(value = "issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /*
     * The issue date of certificate.
     */
    @JsonProperty(value = "issuedDate", access = JsonProperty.Access.WRITE_ONLY)
    private String issuedDate;

    /*
     * The expiration date of certificate.
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private String expirationDate;

    /*
     * The activate date of certificate.
     */
    @JsonProperty(value = "activateDate", access = JsonProperty.Access.WRITE_ONLY)
    private String activateDate;

    /*
     * The subject name of certificate.
     */
    @JsonProperty(value = "subjectName", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectName;

    /*
     * The domain list of certificate.
     */
    @JsonProperty(value = "dnsNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dnsNames;

    /**
     * Get the thumbprint property: The thumbprint of certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the vaultUri property: The vault uri of user key vault.
     *
     * @return the vaultUri value.
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the vaultUri property: The vault uri of user key vault.
     *
     * @param vaultUri the vaultUri value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the keyVaultCertName property: The certificate name of key vault.
     *
     * @return the keyVaultCertName value.
     */
    public String keyVaultCertName() {
        return this.keyVaultCertName;
    }

    /**
     * Set the keyVaultCertName property: The certificate name of key vault.
     *
     * @param keyVaultCertName the keyVaultCertName value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withKeyVaultCertName(String keyVaultCertName) {
        this.keyVaultCertName = keyVaultCertName;
        return this;
    }

    /**
     * Get the certVersion property: The certificate version of key vault.
     *
     * @return the certVersion value.
     */
    public String certVersion() {
        return this.certVersion;
    }

    /**
     * Set the certVersion property: The certificate version of key vault.
     *
     * @param certVersion the certVersion value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withCertVersion(String certVersion) {
        this.certVersion = certVersion;
        return this;
    }

    /**
     * Get the issuer property: The issuer of certificate.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the issuedDate property: The issue date of certificate.
     *
     * @return the issuedDate value.
     */
    public String issuedDate() {
        return this.issuedDate;
    }

    /**
     * Get the expirationDate property: The expiration date of certificate.
     *
     * @return the expirationDate value.
     */
    public String expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the activateDate property: The activate date of certificate.
     *
     * @return the activateDate value.
     */
    public String activateDate() {
        return this.activateDate;
    }

    /**
     * Get the subjectName property: The subject name of certificate.
     *
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get the dnsNames property: The domain list of certificate.
     *
     * @return the dnsNames value.
     */
    public List<String> dnsNames() {
        return this.dnsNames;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property vaultUri in model CertificateProperties"));
        }
        if (keyVaultCertName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVaultCertName in model CertificateProperties"));
        }
    }
}