// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.ContainerRegistry.ImagePushed event. */
@Immutable
public final class ContainerRegistryImagePushedEventData extends ContainerRegistryEventData {
    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setTimestamp(OffsetDateTime timestamp) {
        super.setTimestamp(timestamp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setAction(String action) {
        super.setAction(action);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setTarget(ContainerRegistryEventTarget target) {
        super.setTarget(target);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setRequest(ContainerRegistryEventRequest request) {
        super.setRequest(request);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setActor(ContainerRegistryEventActor actor) {
        super.setActor(actor);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImagePushedEventData setSource(ContainerRegistryEventSource source) {
        super.setSource(source);
        return this;
    }
}