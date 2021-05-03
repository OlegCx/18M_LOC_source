// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.HttpCorrelationProtocol;
import com.azure.resourcemanager.apimanagement.models.OperationNameFormat;
import com.azure.resourcemanager.apimanagement.models.PipelineDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingSettings;
import com.azure.resourcemanager.apimanagement.models.Verbosity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Diagnostic details. */
@JsonFlatten
@Fluent
public class DiagnosticContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticContractInner.class);

    /*
     * Specifies for what type of messages sampling settings should not apply.
     */
    @JsonProperty(value = "properties.alwaysLog")
    private AlwaysLog alwaysLog;

    /*
     * Resource Id of a target logger.
     */
    @JsonProperty(value = "properties.loggerId")
    private String loggerId;

    /*
     * Sampling settings for Diagnostic.
     */
    @JsonProperty(value = "properties.sampling")
    private SamplingSettings sampling;

    /*
     * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     */
    @JsonProperty(value = "properties.frontend")
    private PipelineDiagnosticSettings frontend;

    /*
     * Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     */
    @JsonProperty(value = "properties.backend")
    private PipelineDiagnosticSettings backend;

    /*
     * Log the ClientIP. Default is false.
     */
    @JsonProperty(value = "properties.logClientIp")
    private Boolean logClientIp;

    /*
     * Sets correlation protocol to use for Application Insights diagnostics.
     */
    @JsonProperty(value = "properties.httpCorrelationProtocol")
    private HttpCorrelationProtocol httpCorrelationProtocol;

    /*
     * The verbosity level applied to traces emitted by trace policies.
     */
    @JsonProperty(value = "properties.verbosity")
    private Verbosity verbosity;

    /*
     * The format of the Operation Name for Application Insights telemetries.
     * Default is Name.
     */
    @JsonProperty(value = "properties.operationNameFormat")
    private OperationNameFormat operationNameFormat;

    /**
     * Get the alwaysLog property: Specifies for what type of messages sampling settings should not apply.
     *
     * @return the alwaysLog value.
     */
    public AlwaysLog alwaysLog() {
        return this.alwaysLog;
    }

    /**
     * Set the alwaysLog property: Specifies for what type of messages sampling settings should not apply.
     *
     * @param alwaysLog the alwaysLog value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withAlwaysLog(AlwaysLog alwaysLog) {
        this.alwaysLog = alwaysLog;
        return this;
    }

    /**
     * Get the loggerId property: Resource Id of a target logger.
     *
     * @return the loggerId value.
     */
    public String loggerId() {
        return this.loggerId;
    }

    /**
     * Set the loggerId property: Resource Id of a target logger.
     *
     * @param loggerId the loggerId value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withLoggerId(String loggerId) {
        this.loggerId = loggerId;
        return this;
    }

    /**
     * Get the sampling property: Sampling settings for Diagnostic.
     *
     * @return the sampling value.
     */
    public SamplingSettings sampling() {
        return this.sampling;
    }

    /**
     * Set the sampling property: Sampling settings for Diagnostic.
     *
     * @param sampling the sampling value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withSampling(SamplingSettings sampling) {
        this.sampling = sampling;
        return this;
    }

    /**
     * Get the frontend property: Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     *
     * @return the frontend value.
     */
    public PipelineDiagnosticSettings frontend() {
        return this.frontend;
    }

    /**
     * Set the frontend property: Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     *
     * @param frontend the frontend value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withFrontend(PipelineDiagnosticSettings frontend) {
        this.frontend = frontend;
        return this;
    }

    /**
     * Get the backend property: Diagnostic settings for incoming/outgoing HTTP messages to the Backend.
     *
     * @return the backend value.
     */
    public PipelineDiagnosticSettings backend() {
        return this.backend;
    }

    /**
     * Set the backend property: Diagnostic settings for incoming/outgoing HTTP messages to the Backend.
     *
     * @param backend the backend value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withBackend(PipelineDiagnosticSettings backend) {
        this.backend = backend;
        return this;
    }

    /**
     * Get the logClientIp property: Log the ClientIP. Default is false.
     *
     * @return the logClientIp value.
     */
    public Boolean logClientIp() {
        return this.logClientIp;
    }

    /**
     * Set the logClientIp property: Log the ClientIP. Default is false.
     *
     * @param logClientIp the logClientIp value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withLogClientIp(Boolean logClientIp) {
        this.logClientIp = logClientIp;
        return this;
    }

    /**
     * Get the httpCorrelationProtocol property: Sets correlation protocol to use for Application Insights diagnostics.
     *
     * @return the httpCorrelationProtocol value.
     */
    public HttpCorrelationProtocol httpCorrelationProtocol() {
        return this.httpCorrelationProtocol;
    }

    /**
     * Set the httpCorrelationProtocol property: Sets correlation protocol to use for Application Insights diagnostics.
     *
     * @param httpCorrelationProtocol the httpCorrelationProtocol value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withHttpCorrelationProtocol(HttpCorrelationProtocol httpCorrelationProtocol) {
        this.httpCorrelationProtocol = httpCorrelationProtocol;
        return this;
    }

    /**
     * Get the verbosity property: The verbosity level applied to traces emitted by trace policies.
     *
     * @return the verbosity value.
     */
    public Verbosity verbosity() {
        return this.verbosity;
    }

    /**
     * Set the verbosity property: The verbosity level applied to traces emitted by trace policies.
     *
     * @param verbosity the verbosity value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withVerbosity(Verbosity verbosity) {
        this.verbosity = verbosity;
        return this;
    }

    /**
     * Get the operationNameFormat property: The format of the Operation Name for Application Insights telemetries.
     * Default is Name.
     *
     * @return the operationNameFormat value.
     */
    public OperationNameFormat operationNameFormat() {
        return this.operationNameFormat;
    }

    /**
     * Set the operationNameFormat property: The format of the Operation Name for Application Insights telemetries.
     * Default is Name.
     *
     * @param operationNameFormat the operationNameFormat value to set.
     * @return the DiagnosticContractInner object itself.
     */
    public DiagnosticContractInner withOperationNameFormat(OperationNameFormat operationNameFormat) {
        this.operationNameFormat = operationNameFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sampling() != null) {
            sampling().validate();
        }
        if (frontend() != null) {
            frontend().validate();
        }
        if (backend() != null) {
            backend().validate();
        }
    }
}