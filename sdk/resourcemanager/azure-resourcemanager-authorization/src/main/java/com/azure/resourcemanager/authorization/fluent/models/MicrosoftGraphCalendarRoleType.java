// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphCalendarRoleType. */
public final class MicrosoftGraphCalendarRoleType extends ExpandableStringEnum<MicrosoftGraphCalendarRoleType> {
    /** Static value none for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType NONE = fromString("none");

    /** Static value freeBusyRead for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType FREE_BUSY_READ = fromString("freeBusyRead");

    /** Static value limitedRead for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType LIMITED_READ = fromString("limitedRead");

    /** Static value read for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType READ = fromString("read");

    /** Static value write for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType WRITE = fromString("write");

    /** Static value delegateWithoutPrivateEventAccess for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType DELEGATE_WITHOUT_PRIVATE_EVENT_ACCESS =
        fromString("delegateWithoutPrivateEventAccess");

    /** Static value delegateWithPrivateEventAccess for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType DELEGATE_WITH_PRIVATE_EVENT_ACCESS =
        fromString("delegateWithPrivateEventAccess");

    /** Static value custom for MicrosoftGraphCalendarRoleType. */
    public static final MicrosoftGraphCalendarRoleType CUSTOM = fromString("custom");

    /**
     * Creates or finds a MicrosoftGraphCalendarRoleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphCalendarRoleType.
     */
    @JsonCreator
    public static MicrosoftGraphCalendarRoleType fromString(String name) {
        return fromString(name, MicrosoftGraphCalendarRoleType.class);
    }

    /** @return known MicrosoftGraphCalendarRoleType values. */
    public static Collection<MicrosoftGraphCalendarRoleType> values() {
        return values(MicrosoftGraphCalendarRoleType.class);
    }
}