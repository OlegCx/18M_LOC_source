// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ShareDestinationFormatType. */
public enum ShareDestinationFormatType {
    /** Enum value UnknownType. */
    UNKNOWN_TYPE("UnknownType"),

    /** Enum value HCS. */
    HCS("HCS"),

    /** Enum value BlockBlob. */
    BLOCK_BLOB("BlockBlob"),

    /** Enum value PageBlob. */
    PAGE_BLOB("PageBlob"),

    /** Enum value AzureFile. */
    AZURE_FILE("AzureFile"),

    /** Enum value ManagedDisk. */
    MANAGED_DISK("ManagedDisk");

    /** The actual serialized value for a ShareDestinationFormatType instance. */
    private final String value;

    ShareDestinationFormatType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ShareDestinationFormatType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ShareDestinationFormatType object, or null if unable to parse.
     */
    @JsonCreator
    public static ShareDestinationFormatType fromString(String value) {
        ShareDestinationFormatType[] items = ShareDestinationFormatType.values();
        for (ShareDestinationFormatType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}