// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The result of a request to retrieve a key-value from the specified configuration store. */
@Immutable
public final class KeyValueInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyValueInner.class);

    /*
     * The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a
     * key-value.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /*
     * A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a
     * key-value.
     */
    @JsonProperty(value = "label", access = JsonProperty.Access.WRITE_ONLY)
    private String label;

    /*
     * The value of the key-value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values
     * when they are retrieved by applications.
     */
    @JsonProperty(value = "contentType", access = JsonProperty.Access.WRITE_ONLY)
    private String contentType;

    /*
     * An ETag indicating the state of a key-value within a configuration
     * store.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The last time a modifying operation was performed on the given
     * key-value.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     */
    @JsonProperty(value = "locked", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean locked;

    /*
     * A dictionary of tags that can help identify what a key-value may be
     * applicable for.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the key property: The primary identifier of a key-value. The key is used in unison with the label to uniquely
     * identify a key-value.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Get the label property: A value used to group key-values. The label is used in unison with the key to uniquely
     * identify a key-value.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Get the value property: The value of the key-value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the contentType property: The content type of the key-value's value. Providing a proper content-type can
     * enable transformations of values when they are retrieved by applications.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Get the etag property: An ETag indicating the state of a key-value within a configuration store.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the lastModified property: The last time a modifying operation was performed on the given key-value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the locked property: A value indicating whether the key-value is locked. A locked key-value may not be
     * modified until it is unlocked.
     *
     * @return the locked value.
     */
    public Boolean locked() {
        return this.locked;
    }

    /**
     * Get the tags property: A dictionary of tags that can help identify what a key-value may be applicable for.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
