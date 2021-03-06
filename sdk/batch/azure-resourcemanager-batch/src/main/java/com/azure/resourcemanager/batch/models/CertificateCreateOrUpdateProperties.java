// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate properties for create operations. */
@Fluent
public final class CertificateCreateOrUpdateProperties extends CertificateBaseProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateCreateOrUpdateProperties.class);

    /*
     * The maximum size is 10KB.
     */
    @JsonProperty(value = "data", required = true)
    private String data;

    /*
     * This must not be specified if the certificate format is Cer.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the data property: The maximum size is 10KB.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: The maximum size is 10KB.
     *
     * @param data the data value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password property: This must not be specified if the certificate format is Cer.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: This must not be specified if the certificate format is Cer.
     *
     * @param password the password value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateCreateOrUpdateProperties withThumbprintAlgorithm(String thumbprintAlgorithm) {
        super.withThumbprintAlgorithm(thumbprintAlgorithm);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateCreateOrUpdateProperties withThumbprint(String thumbprint) {
        super.withThumbprint(thumbprint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateCreateOrUpdateProperties withFormat(CertificateFormat format) {
        super.withFormat(format);
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
        if (data() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property data in model CertificateCreateOrUpdateProperties"));
        }
    }
}
