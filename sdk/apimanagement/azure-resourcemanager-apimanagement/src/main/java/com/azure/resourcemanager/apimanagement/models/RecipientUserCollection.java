// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.RecipientUserCollectionInner;
import java.util.List;

/** An immutable client-side representation of RecipientUserCollection. */
public interface RecipientUserCollection {
    /**
     * Gets the value property: Page values.
     *
     * @return the value value.
     */
    List<RecipientUserContract> value();

    /**
     * Gets the count property: Total record count number across all pages.
     *
     * @return the count value.
     */
    Long count();

    /**
     * Gets the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.RecipientUserCollectionInner object.
     *
     * @return the inner object.
     */
    RecipientUserCollectionInner innerModel();
}