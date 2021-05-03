// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AnomalyIncidentStatus. */
public final class AnomalyIncidentStatus extends ExpandableStringEnum<AnomalyIncidentStatus> {
    /** Static value Active for AnomalyIncidentStatus. */
    public static final AnomalyIncidentStatus ACTIVE = fromString("Active");

    /** Static value Resolved for AnomalyIncidentStatus. */
    public static final AnomalyIncidentStatus RESOLVED = fromString("Resolved");

    /**
     * Creates or finds a AnomalyIncidentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnomalyIncidentStatus.
     */
    @JsonCreator
    public static AnomalyIncidentStatus fromString(String name) {
        return fromString(name, AnomalyIncidentStatus.class);
    }

    /** @return known AnomalyIncidentStatus values. */
    public static Collection<AnomalyIncidentStatus> values() {
        return values(AnomalyIncidentStatus.class);
    }
}