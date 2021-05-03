// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VideoAnalyzerEndpointType. */
public final class VideoAnalyzerEndpointType extends ExpandableStringEnum<VideoAnalyzerEndpointType> {
    /** Static value ClientApi for VideoAnalyzerEndpointType. */
    public static final VideoAnalyzerEndpointType CLIENT_API = fromString("ClientApi");

    /**
     * Creates or finds a VideoAnalyzerEndpointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VideoAnalyzerEndpointType.
     */
    @JsonCreator
    public static VideoAnalyzerEndpointType fromString(String name) {
        return fromString(name, VideoAnalyzerEndpointType.class);
    }

    /** @return known VideoAnalyzerEndpointType values. */
    public static Collection<VideoAnalyzerEndpointType> values() {
        return values(VideoAnalyzerEndpointType.class);
    }
}