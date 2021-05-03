// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Marks terms as keywords. This token filter is implemented using Apache Lucene. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.KeywordMarkerTokenFilter")
@JsonFlatten
@Fluent
public class KeywordMarkerTokenFilter extends TokenFilter {
    /*
     * A list of words to mark as keywords.
     */
    @JsonProperty(value = "keywords", required = true)
    private List<String> keywords;

    /*
     * A value indicating whether to ignore case. If true, all words are
     * converted to lower case first. Default is false.
     */
    @JsonProperty(value = "ignoreCase")
    private Boolean ignoreCase;

    /**
     * Creates an instance of KeywordMarkerTokenFilter class.
     *
     * @param name the name value to set.
     * @param keywords the keywords value to set.
     */
    @JsonCreator
    public KeywordMarkerTokenFilter(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "keywords", required = true) List<String> keywords) {
        super(name);
        this.keywords = keywords;
    }

    /**
     * Get the keywords property: A list of words to mark as keywords.
     *
     * @return the keywords value.
     */
    public List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * Get the ignoreCase property: A value indicating whether to ignore case. If true, all words are converted to lower
     * case first. Default is false.
     *
     * @return the ignoreCase value.
     */
    public Boolean isIgnoreCase() {
        return this.ignoreCase;
    }

    /**
     * Set the ignoreCase property: A value indicating whether to ignore case. If true, all words are converted to lower
     * case first. Default is false.
     *
     * @param ignoreCase the ignoreCase value to set.
     * @return the KeywordMarkerTokenFilter object itself.
     */
    public KeywordMarkerTokenFilter setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }
}