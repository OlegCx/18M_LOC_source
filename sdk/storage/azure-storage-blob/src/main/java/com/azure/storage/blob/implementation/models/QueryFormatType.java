// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for QueryFormatType. */
public enum QueryFormatType {
    /** Enum value delimited. */
    DELIMITED("delimited"),

    /** Enum value json. */
    JSON("json"),

    /** Enum value arrow. */
    ARROW("arrow");

    /** The actual serialized value for a QueryFormatType instance. */
    private final String value;

    QueryFormatType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a QueryFormatType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed QueryFormatType object, or null if unable to parse.
     */
    @JsonCreator
    public static QueryFormatType fromString(String value) {
        QueryFormatType[] items = QueryFormatType.values();
        for (QueryFormatType item : items) {
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
