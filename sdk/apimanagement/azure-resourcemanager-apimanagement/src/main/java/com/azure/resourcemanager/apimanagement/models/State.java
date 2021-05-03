// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for State. */
public final class State extends ExpandableStringEnum<State> {
    /** Static value proposed for State. */
    public static final State PROPOSED = fromString("proposed");

    /** Static value open for State. */
    public static final State OPEN = fromString("open");

    /** Static value removed for State. */
    public static final State REMOVED = fromString("removed");

    /** Static value resolved for State. */
    public static final State RESOLVED = fromString("resolved");

    /** Static value closed for State. */
    public static final State CLOSED = fromString("closed");

    /**
     * Creates or finds a State from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /** @return known State values. */
    public static Collection<State> values() {
        return values(State.class);
    }
}