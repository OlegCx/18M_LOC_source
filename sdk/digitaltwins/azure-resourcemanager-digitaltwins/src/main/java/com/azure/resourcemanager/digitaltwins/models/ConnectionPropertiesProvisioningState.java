// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectionPropertiesProvisioningState. */
public final class ConnectionPropertiesProvisioningState
    extends ExpandableStringEnum<ConnectionPropertiesProvisioningState> {
    /** Static value Pending for ConnectionPropertiesProvisioningState. */
    public static final ConnectionPropertiesProvisioningState PENDING = fromString("Pending");

    /** Static value Approved for ConnectionPropertiesProvisioningState. */
    public static final ConnectionPropertiesProvisioningState APPROVED = fromString("Approved");

    /** Static value Rejected for ConnectionPropertiesProvisioningState. */
    public static final ConnectionPropertiesProvisioningState REJECTED = fromString("Rejected");

    /** Static value Disconnected for ConnectionPropertiesProvisioningState. */
    public static final ConnectionPropertiesProvisioningState DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a ConnectionPropertiesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionPropertiesProvisioningState.
     */
    @JsonCreator
    public static ConnectionPropertiesProvisioningState fromString(String name) {
        return fromString(name, ConnectionPropertiesProvisioningState.class);
    }

    /** @return known ConnectionPropertiesProvisioningState values. */
    public static Collection<ConnectionPropertiesProvisioningState> values() {
        return values(ConnectionPropertiesProvisioningState.class);
    }
}