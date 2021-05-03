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
 * An object containing the example utterance's text.
 */
public class LabelTextObject {
    /**
     * The ID of the Label.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * The text of the label.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the LabelTextObject object itself.
     */
    public LabelTextObject withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the LabelTextObject object itself.
     */
    public LabelTextObject withText(String text) {
        this.text = text;
        return this;
    }

}