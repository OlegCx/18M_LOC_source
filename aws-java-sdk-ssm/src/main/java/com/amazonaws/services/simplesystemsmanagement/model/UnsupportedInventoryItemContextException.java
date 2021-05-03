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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <code>Context</code> attribute that you specified for the <code>InventoryItem</code> is not allowed for this
 * inventory type. You can only use the <code>Context</code> attribute with inventory types like
 * <code>AWS:ComplianceItem</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedInventoryItemContextException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private String typeName;

    /**
     * Constructs a new UnsupportedInventoryItemContextException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedInventoryItemContextException(String message) {
        super(message);
    }

    /**
     * @param typeName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("TypeName")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("TypeName")
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @param typeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedInventoryItemContextException withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

}
