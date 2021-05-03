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
package com.amazonaws.services.backup.model;

import javax.annotation.Generated;

/**
 * <p>
 * AWS Backup is already performing an action on this recovery point. It can't perform the action you requested until
 * the first action finishes. Try again later.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidResourceStateException extends com.amazonaws.services.backup.model.AWSBackupException {
    private static final long serialVersionUID = 1L;

    private String code;
    /** <p/> */
    private String type;
    /** <p/> */
    private String context;

    /**
     * Constructs a new InvalidResourceStateException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidResourceStateException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidResourceStateException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p/>
     * 
     * @param type
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p/>
     * 
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidResourceStateException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p/>
     * 
     * @param context
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p/>
     * 
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Context")
    public String getContext() {
        return this.context;
    }

    /**
     * <p/>
     * 
     * @param context
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidResourceStateException withContext(String context) {
        setContext(context);
        return this;
    }

}
