// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.annotation.Fluent;

/**
 * Options associated with the list tag options.
 */
@Fluent
public final class ListTagsOptions {
    private TagOrderBy tagOrderBy;

    /**
     * Initializes instance of ListTagsOptions
     */
    public ListTagsOptions() { }

    /**
     * Gets the orderby tag. It represents the order in which the tag results should be ordered.
     *
     * @return The order by tag value.
     */
    public TagOrderBy getTagOrderBy() {
        return tagOrderBy;
    }

    /**
     * Gets the orderby tag. It represents the order in which the tag results should be ordered.
     *
     * @param orderBy the order in which the operations should be returned.
     * @return The order by tag value.
     */
    public ListTagsOptions setTagOrderBy(TagOrderBy orderBy) {
        this.tagOrderBy = orderBy;
        return this;
    }
}
