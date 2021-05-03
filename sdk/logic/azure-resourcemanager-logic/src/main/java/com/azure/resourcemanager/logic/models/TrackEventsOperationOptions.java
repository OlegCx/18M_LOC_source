// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TrackEventsOperationOptions. */
public final class TrackEventsOperationOptions extends ExpandableStringEnum<TrackEventsOperationOptions> {
    /** Static value None for TrackEventsOperationOptions. */
    public static final TrackEventsOperationOptions NONE = fromString("None");

    /** Static value DisableSourceInfoEnrich for TrackEventsOperationOptions. */
    public static final TrackEventsOperationOptions DISABLE_SOURCE_INFO_ENRICH = fromString("DisableSourceInfoEnrich");

    /**
     * Creates or finds a TrackEventsOperationOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrackEventsOperationOptions.
     */
    @JsonCreator
    public static TrackEventsOperationOptions fromString(String name) {
        return fromString(name, TrackEventsOperationOptions.class);
    }

    /** @return known TrackEventsOperationOptions values. */
    public static Collection<TrackEventsOperationOptions> values() {
        return values(TrackEventsOperationOptions.class);
    }
}