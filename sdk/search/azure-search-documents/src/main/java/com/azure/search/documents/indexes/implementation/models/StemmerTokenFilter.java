// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.search.documents.indexes.models.StemmerTokenFilterLanguage;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Language specific stemming filter. This token filter is implemented using Apache Lucene. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.StemmerTokenFilter")
@JsonFlatten
@Fluent
public class StemmerTokenFilter extends TokenFilter {
    /*
     * The language to use.
     */
    @JsonProperty(value = "language", required = true)
    private StemmerTokenFilterLanguage language;

    /**
     * Creates an instance of StemmerTokenFilter class.
     *
     * @param name the name value to set.
     * @param language the language value to set.
     */
    @JsonCreator
    public StemmerTokenFilter(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "language", required = true) StemmerTokenFilterLanguage language) {
        super(name);
        this.language = language;
    }

    /**
     * Get the language property: The language to use.
     *
     * @return the language value.
     */
    public StemmerTokenFilterLanguage getLanguage() {
        return this.language;
    }
}