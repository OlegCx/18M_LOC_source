/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_07_01.implementation.PeerExpressRouteCircuitConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing PeerExpressRouteCircuitConnection.
 */
public interface PeerExpressRouteCircuitConnection extends HasInner<PeerExpressRouteCircuitConnectionInner>, Indexable, Refreshable<PeerExpressRouteCircuitConnection>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the authResourceGuid value.
     */
    String authResourceGuid();

    /**
     * @return the circuitConnectionStatus value.
     */
    CircuitConnectionStatus circuitConnectionStatus();

    /**
     * @return the connectionName value.
     */
    String connectionName();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRouteCircuitPeering value.
     */
    SubResource expressRouteCircuitPeering();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peerExpressRouteCircuitPeering value.
     */
    SubResource peerExpressRouteCircuitPeering();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

}