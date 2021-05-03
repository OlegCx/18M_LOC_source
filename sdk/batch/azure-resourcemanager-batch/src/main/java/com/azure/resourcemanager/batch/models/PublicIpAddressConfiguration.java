// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The public IP Address configuration of the networking configuration of a Pool. */
@Fluent
public final class PublicIpAddressConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressConfiguration.class);

    /*
     * The default value is BatchManaged
     */
    @JsonProperty(value = "provision")
    private IpAddressProvisioningType provision;

    /*
     * The number of IPs specified here limits the maximum size of the Pool -
     * 100 dedicated nodes or 100 low-priority nodes can be allocated for each
     * public IP. For example, a pool needing 250 dedicated VMs would need at
     * least 3 public IPs specified. Each element of this collection is of the
     * form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     */
    @JsonProperty(value = "ipAddressIds")
    private List<String> ipAddressIds;

    /**
     * Get the provision property: The default value is BatchManaged.
     *
     * @return the provision value.
     */
    public IpAddressProvisioningType provision() {
        return this.provision;
    }

    /**
     * Set the provision property: The default value is BatchManaged.
     *
     * @param provision the provision value to set.
     * @return the PublicIpAddressConfiguration object itself.
     */
    public PublicIpAddressConfiguration withProvision(IpAddressProvisioningType provision) {
        this.provision = provision;
        return this;
    }

    /**
     * Get the ipAddressIds property: The number of IPs specified here limits the maximum size of the Pool - 100
     * dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250
     * dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @return the ipAddressIds value.
     */
    public List<String> ipAddressIds() {
        return this.ipAddressIds;
    }

    /**
     * Set the ipAddressIds property: The number of IPs specified here limits the maximum size of the Pool - 100
     * dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250
     * dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @param ipAddressIds the ipAddressIds value to set.
     * @return the PublicIpAddressConfiguration object itself.
     */
    public PublicIpAddressConfiguration withIpAddressIds(List<String> ipAddressIds) {
        this.ipAddressIds = ipAddressIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}