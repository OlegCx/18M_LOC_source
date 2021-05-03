/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ClusterProvisioningState.
 */
public final class ClusterProvisioningState extends ExpandableStringEnum<ClusterProvisioningState> {
    /** Static value Succeeded for ClusterProvisioningState. */
    public static final ClusterProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ClusterProvisioningState. */
    public static final ClusterProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ClusterProvisioningState. */
    public static final ClusterProvisioningState CANCELED = fromString("Canceled");

    /** Static value InProgress for ClusterProvisioningState. */
    public static final ClusterProvisioningState IN_PROGRESS = fromString("InProgress");

    /**
     * Creates or finds a ClusterProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding ClusterProvisioningState
     */
    @JsonCreator
    public static ClusterProvisioningState fromString(String name) {
        return fromString(name, ClusterProvisioningState.class);
    }

    /**
     * @return known ClusterProvisioningState values
     */
    public static Collection<ClusterProvisioningState> values() {
        return values(ClusterProvisioningState.class);
    }
}