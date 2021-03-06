// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import java.util.Map;

/** Job output canceling event data. */
@Immutable
public final class MediaJobOutputCancelingEventData extends MediaJobOutputStateChangeEventData {
    /** {@inheritDoc} */
    @Override
    public MediaJobOutputCancelingEventData setOutput(MediaJobOutput output) {
        super.setOutput(output);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaJobOutputCancelingEventData setJobCorrelationData(Map<String, String> jobCorrelationData) {
        super.setJobCorrelationData(jobCorrelationData);
        return this;
    }
}
