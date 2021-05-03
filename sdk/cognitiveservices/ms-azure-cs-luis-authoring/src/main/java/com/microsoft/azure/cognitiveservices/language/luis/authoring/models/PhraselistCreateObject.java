/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for creating a phraselist model.
 */
public class PhraselistCreateObject {
    /**
     * List of comma-separated phrases that represent the Phraselist.
     */
    @JsonProperty(value = "phrases")
    private String phrases;

    /**
     * The Phraselist name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * An interchangeable phrase list feature serves as a list of synonyms for
     * training. A non-exchangeable phrase list serves as separate features for
     * training. So, if your non-interchangeable phrase list contains 5
     * phrases, they will be mapped to 5 separate features. You can think of
     * the non-interchangeable phrase list as an additional bag of words to add
     * to LUIS existing vocabulary features. It is used as a lexicon lookup
     * feature where its value is 1 if the lexicon contains a given word or 0
     * if it doesn’t.  Default value is true.
     */
    @JsonProperty(value = "isExchangeable")
    private Boolean isExchangeable;

    /**
     * Indicates if the Phraselist is enabled for all models in the
     * application.
     */
    @JsonProperty(value = "enabledForAllModels")
    private Boolean enabledForAllModels;

    /**
     * Get the phrases value.
     *
     * @return the phrases value
     */
    public String phrases() {
        return this.phrases;
    }

    /**
     * Set the phrases value.
     *
     * @param phrases the phrases value to set
     * @return the PhraselistCreateObject object itself.
     */
    public PhraselistCreateObject withPhrases(String phrases) {
        this.phrases = phrases;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the PhraselistCreateObject object itself.
     */
    public PhraselistCreateObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isExchangeable value.
     *
     * @return the isExchangeable value
     */
    public Boolean isExchangeable() {
        return this.isExchangeable;
    }

    /**
     * Set the isExchangeable value.
     *
     * @param isExchangeable the isExchangeable value to set
     * @return the PhraselistCreateObject object itself.
     */
    public PhraselistCreateObject withIsExchangeable(Boolean isExchangeable) {
        this.isExchangeable = isExchangeable;
        return this;
    }

    /**
     * Get the enabledForAllModels value.
     *
     * @return the enabledForAllModels value
     */
    public Boolean enabledForAllModels() {
        return this.enabledForAllModels;
    }

    /**
     * Set the enabledForAllModels value.
     *
     * @param enabledForAllModels the enabledForAllModels value to set
     * @return the PhraselistCreateObject object itself.
     */
    public PhraselistCreateObject withEnabledForAllModels(Boolean enabledForAllModels) {
        this.enabledForAllModels = enabledForAllModels;
        return this;
    }

}