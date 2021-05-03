/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail.model;

import javax.annotation.Generated;

/**
 * <p>
 * Lightsail throws this exception when user input does not conform to the validation rules of an input field.
 * </p>
 * <note>
 * <p>
 * Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region. Please set
 * your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these resources.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInputException extends com.amazonaws.services.lightsail.model.AmazonLightsailException {
    private static final long serialVersionUID = 1L;

    private String code;

    private String docs;

    private String tip;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * @param docs
     */

    @com.fasterxml.jackson.annotation.JsonProperty("docs")
    public void setDocs(String docs) {
        this.docs = docs;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("docs")
    public String getDocs() {
        return this.docs;
    }

    /**
     * @param docs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withDocs(String docs) {
        setDocs(docs);
        return this;
    }

    /**
     * @param tip
     */

    @com.fasterxml.jackson.annotation.JsonProperty("tip")
    public void setTip(String tip) {
        this.tip = tip;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("tip")
    public String getTip() {
        return this.tip;
    }

    /**
     * @param tip
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withTip(String tip) {
        setTip(tip);
        return this;
    }

}
