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
 * Object model for updating an application's settings.
 */
public class ApplicationSettingUpdateObject {
    /**
     * Setting your application as public allows other people to use your
     * application's endpoint using their own keys.
     */
    @JsonProperty(value = "public")
    private boolean isPublic;

    /**
     * Get the isPublic value.
     *
     * @return the isPublic value
     */
    public boolean isPublic() {
        return this.isPublic;
    }

    /**
     * Set the isPublic value.
     *
     * @param isPublic the isPublic value to set
     * @return the ApplicationSettingUpdateObject object itself.
     */
    public ApplicationSettingUpdateObject withIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

}