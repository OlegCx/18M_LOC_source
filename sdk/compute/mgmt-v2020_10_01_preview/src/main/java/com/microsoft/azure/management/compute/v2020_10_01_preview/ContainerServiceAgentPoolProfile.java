/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for the container service agent pool.
 */
public class ContainerServiceAgentPoolProfile {
    /**
     * Unique name of the agent pool profile in the context of the subscription
     * and resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 1 to 100 (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * Size of agent VMs. Possible values include: 'Standard_A0',
     * 'Standard_A1', 'Standard_A2', 'Standard_A3', 'Standard_A4',
     * 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8',
     * 'Standard_A9', 'Standard_A10', 'Standard_A11', 'Standard_D1',
     * 'Standard_D2', 'Standard_D3', 'Standard_D4', 'Standard_D11',
     * 'Standard_D12', 'Standard_D13', 'Standard_D14', 'Standard_D1_v2',
     * 'Standard_D2_v2', 'Standard_D3_v2', 'Standard_D4_v2', 'Standard_D5_v2',
     * 'Standard_D11_v2', 'Standard_D12_v2', 'Standard_D13_v2',
     * 'Standard_D14_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3',
     * 'Standard_G4', 'Standard_G5', 'Standard_DS1', 'Standard_DS2',
     * 'Standard_DS3', 'Standard_DS4', 'Standard_DS11', 'Standard_DS12',
     * 'Standard_DS13', 'Standard_DS14', 'Standard_GS1', 'Standard_GS2',
     * 'Standard_GS3', 'Standard_GS4', 'Standard_GS5'.
     */
    @JsonProperty(value = "vmSize", required = true)
    private ContainerServiceVMSizeTypes vmSize;

    /**
     * DNS prefix to be used to create the FQDN for the agent pool.
     */
    @JsonProperty(value = "dnsPrefix", required = true)
    private String dnsPrefix;

    /**
     * FQDN for the agent pool.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get unique name of the agent pool profile in the context of the subscription and resource group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set unique name of the agent pool profile in the context of the subscription and resource group.
     *
     * @param name the name value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get number of agents (VMs) to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set number of agents (VMs) to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get size of agent VMs. Possible values include: 'Standard_A0', 'Standard_A1', 'Standard_A2', 'Standard_A3', 'Standard_A4', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A9', 'Standard_A10', 'Standard_A11', 'Standard_D1', 'Standard_D2', 'Standard_D3', 'Standard_D4', 'Standard_D11', 'Standard_D12', 'Standard_D13', 'Standard_D14', 'Standard_D1_v2', 'Standard_D2_v2', 'Standard_D3_v2', 'Standard_D4_v2', 'Standard_D5_v2', 'Standard_D11_v2', 'Standard_D12_v2', 'Standard_D13_v2', 'Standard_D14_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_DS1', 'Standard_DS2', 'Standard_DS3', 'Standard_DS4', 'Standard_DS11', 'Standard_DS12', 'Standard_DS13', 'Standard_DS14', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS5'.
     *
     * @return the vmSize value
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set size of agent VMs. Possible values include: 'Standard_A0', 'Standard_A1', 'Standard_A2', 'Standard_A3', 'Standard_A4', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A9', 'Standard_A10', 'Standard_A11', 'Standard_D1', 'Standard_D2', 'Standard_D3', 'Standard_D4', 'Standard_D11', 'Standard_D12', 'Standard_D13', 'Standard_D14', 'Standard_D1_v2', 'Standard_D2_v2', 'Standard_D3_v2', 'Standard_D4_v2', 'Standard_D5_v2', 'Standard_D11_v2', 'Standard_D12_v2', 'Standard_D13_v2', 'Standard_D14_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_DS1', 'Standard_DS2', 'Standard_DS3', 'Standard_DS4', 'Standard_DS11', 'Standard_DS12', 'Standard_DS13', 'Standard_DS14', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS5'.
     *
     * @param vmSize the vmSize value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get dNS prefix to be used to create the FQDN for the agent pool.
     *
     * @return the dnsPrefix value
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set dNS prefix to be used to create the FQDN for the agent pool.
     *
     * @param dnsPrefix the dnsPrefix value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get fQDN for the agent pool.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

}
