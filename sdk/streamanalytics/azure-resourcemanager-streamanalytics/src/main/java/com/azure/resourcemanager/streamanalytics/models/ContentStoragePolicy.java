// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContentStoragePolicy. */
public final class ContentStoragePolicy extends ExpandableStringEnum<ContentStoragePolicy> {
    /** Static value SystemAccount for ContentStoragePolicy. */
    public static final ContentStoragePolicy SYSTEM_ACCOUNT = fromString("SystemAccount");

    /** Static value JobStorageAccount for ContentStoragePolicy. */
    public static final ContentStoragePolicy JOB_STORAGE_ACCOUNT = fromString("JobStorageAccount");

    /**
     * Creates or finds a ContentStoragePolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentStoragePolicy.
     */
    @JsonCreator
    public static ContentStoragePolicy fromString(String name) {
        return fromString(name, ContentStoragePolicy.class);
    }

    /** @return known ContentStoragePolicy values. */
    public static Collection<ContentStoragePolicy> values() {
        return values(ContentStoragePolicy.class);
    }
}