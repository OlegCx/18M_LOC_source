// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents various service level limits. */
@Fluent
public final class SearchServiceLimits {
    /*
     * The maximum allowed fields per index.
     */
    @JsonProperty(value = "maxFieldsPerIndex")
    private Integer maxFieldsPerIndex;

    /*
     * The maximum depth which you can nest sub-fields in an index, including
     * the top-level complex field. For example, a/b/c has a nesting depth of
     * 3.
     */
    @JsonProperty(value = "maxFieldNestingDepthPerIndex")
    private Integer maxFieldNestingDepthPerIndex;

    /*
     * The maximum number of fields of type Collection(Edm.ComplexType) allowed
     * in an index.
     */
    @JsonProperty(value = "maxComplexCollectionFieldsPerIndex")
    private Integer maxComplexCollectionFieldsPerIndex;

    /*
     * The maximum number of objects in complex collections allowed per
     * document.
     */
    @JsonProperty(value = "maxComplexObjectsInCollectionsPerDocument")
    private Integer maxComplexObjectsInCollectionsPerDocument;

    /**
     * Get the maxFieldsPerIndex property: The maximum allowed fields per index.
     *
     * @return the maxFieldsPerIndex value.
     */
    public Integer getMaxFieldsPerIndex() {
        return this.maxFieldsPerIndex;
    }

    /**
     * Set the maxFieldsPerIndex property: The maximum allowed fields per index.
     *
     * @param maxFieldsPerIndex the maxFieldsPerIndex value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxFieldsPerIndex(Integer maxFieldsPerIndex) {
        this.maxFieldsPerIndex = maxFieldsPerIndex;
        return this;
    }

    /**
     * Get the maxFieldNestingDepthPerIndex property: The maximum depth which you can nest sub-fields in an index,
     * including the top-level complex field. For example, a/b/c has a nesting depth of 3.
     *
     * @return the maxFieldNestingDepthPerIndex value.
     */
    public Integer getMaxFieldNestingDepthPerIndex() {
        return this.maxFieldNestingDepthPerIndex;
    }

    /**
     * Set the maxFieldNestingDepthPerIndex property: The maximum depth which you can nest sub-fields in an index,
     * including the top-level complex field. For example, a/b/c has a nesting depth of 3.
     *
     * @param maxFieldNestingDepthPerIndex the maxFieldNestingDepthPerIndex value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxFieldNestingDepthPerIndex(Integer maxFieldNestingDepthPerIndex) {
        this.maxFieldNestingDepthPerIndex = maxFieldNestingDepthPerIndex;
        return this;
    }

    /**
     * Get the maxComplexCollectionFieldsPerIndex property: The maximum number of fields of type
     * Collection(Edm.ComplexType) allowed in an index.
     *
     * @return the maxComplexCollectionFieldsPerIndex value.
     */
    public Integer getMaxComplexCollectionFieldsPerIndex() {
        return this.maxComplexCollectionFieldsPerIndex;
    }

    /**
     * Set the maxComplexCollectionFieldsPerIndex property: The maximum number of fields of type
     * Collection(Edm.ComplexType) allowed in an index.
     *
     * @param maxComplexCollectionFieldsPerIndex the maxComplexCollectionFieldsPerIndex value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxComplexCollectionFieldsPerIndex(Integer maxComplexCollectionFieldsPerIndex) {
        this.maxComplexCollectionFieldsPerIndex = maxComplexCollectionFieldsPerIndex;
        return this;
    }

    /**
     * Get the maxComplexObjectsInCollectionsPerDocument property: The maximum number of objects in complex collections
     * allowed per document.
     *
     * @return the maxComplexObjectsInCollectionsPerDocument value.
     */
    public Integer getMaxComplexObjectsInCollectionsPerDocument() {
        return this.maxComplexObjectsInCollectionsPerDocument;
    }

    /**
     * Set the maxComplexObjectsInCollectionsPerDocument property: The maximum number of objects in complex collections
     * allowed per document.
     *
     * @param maxComplexObjectsInCollectionsPerDocument the maxComplexObjectsInCollectionsPerDocument value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxComplexObjectsInCollectionsPerDocument(
            Integer maxComplexObjectsInCollectionsPerDocument) {
        this.maxComplexObjectsInCollectionsPerDocument = maxComplexObjectsInCollectionsPerDocument;
        return this;
    }
}