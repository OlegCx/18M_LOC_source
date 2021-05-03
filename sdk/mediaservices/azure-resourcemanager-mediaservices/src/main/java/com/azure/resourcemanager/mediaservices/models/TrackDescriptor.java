// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base type for all TrackDescriptor types, which define the metadata and selection for tracks that should be processed
 * by a Job.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = TrackDescriptor.class)
@JsonTypeName("TrackDescriptor")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AudioTrackDescriptor", value = AudioTrackDescriptor.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.VideoTrackDescriptor", value = VideoTrackDescriptor.class)
})
@JsonFlatten
@Immutable
public class TrackDescriptor {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrackDescriptor.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}