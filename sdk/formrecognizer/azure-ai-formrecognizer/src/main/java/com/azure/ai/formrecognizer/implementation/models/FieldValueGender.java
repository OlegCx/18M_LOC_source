// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FieldValueGender. */
public final class FieldValueGender extends ExpandableStringEnum<FieldValueGender> {
    /** Static value M for FieldValueGender. */
    public static final FieldValueGender M = fromString("M");

    /** Static value F for FieldValueGender. */
    public static final FieldValueGender F = fromString("F");

    /** Static value X for FieldValueGender. */
    public static final FieldValueGender X = fromString("X");

    /**
     * Creates or finds a FieldValueGender from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FieldValueGender.
     */
    @JsonCreator
    public static FieldValueGender fromString(String name) {
        return fromString(name, FieldValueGender.class);
    }

    /** @return known FieldValueGender values. */
    public static Collection<FieldValueGender> values() {
        return values(FieldValueGender.class);
    }
}
