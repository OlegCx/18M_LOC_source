// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FilterTrackPropertyType. */
public final class FilterTrackPropertyType extends ExpandableStringEnum<FilterTrackPropertyType> {
    /** Static value Unknown for FilterTrackPropertyType. */
    public static final FilterTrackPropertyType UNKNOWN = fromString("Unknown");

    /** Static value Type for FilterTrackPropertyType. */
    public static final FilterTrackPropertyType TYPE = fromString("Type");

    /** Static value Name for FilterTrackPropertyType. */
    public static final FilterTrackPropertyType NAME = fromString("Name");

    /** Static value Language for FilterTrackPropertyType. */
    public static final FilterTrackPropertyType LANGUAGE = fromString("Language");

    /** Static value FourCC for FilterTrackPropertyType. */
    public static final FilterTrackPropertyType FOUR_CC = fromString("FourCC");

    /** Static value Bitrate for FilterTrackPropertyType. */
    public static final FilterTrackPropertyType BITRATE = fromString("Bitrate");

    /**
     * Creates or finds a FilterTrackPropertyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FilterTrackPropertyType.
     */
    @JsonCreator
    public static FilterTrackPropertyType fromString(String name) {
        return fromString(name, FilterTrackPropertyType.class);
    }

    /** @return known FilterTrackPropertyType values. */
    public static Collection<FilterTrackPropertyType> values() {
        return values(FilterTrackPropertyType.class);
    }
}