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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CancelSchemaExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSchemaExtensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory whose schema extension will be canceled.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The identifier of the schema extension that will be canceled.
     * </p>
     */
    private String schemaExtensionId;

    /**
     * <p>
     * The identifier of the directory whose schema extension will be canceled.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory whose schema extension will be canceled.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory whose schema extension will be canceled.
     * </p>
     * 
     * @return The identifier of the directory whose schema extension will be canceled.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory whose schema extension will be canceled.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory whose schema extension will be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSchemaExtensionRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The identifier of the schema extension that will be canceled.
     * </p>
     * 
     * @param schemaExtensionId
     *        The identifier of the schema extension that will be canceled.
     */

    public void setSchemaExtensionId(String schemaExtensionId) {
        this.schemaExtensionId = schemaExtensionId;
    }

    /**
     * <p>
     * The identifier of the schema extension that will be canceled.
     * </p>
     * 
     * @return The identifier of the schema extension that will be canceled.
     */

    public String getSchemaExtensionId() {
        return this.schemaExtensionId;
    }

    /**
     * <p>
     * The identifier of the schema extension that will be canceled.
     * </p>
     * 
     * @param schemaExtensionId
     *        The identifier of the schema extension that will be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSchemaExtensionRequest withSchemaExtensionId(String schemaExtensionId) {
        setSchemaExtensionId(schemaExtensionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getSchemaExtensionId() != null)
            sb.append("SchemaExtensionId: ").append(getSchemaExtensionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSchemaExtensionRequest == false)
            return false;
        CancelSchemaExtensionRequest other = (CancelSchemaExtensionRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getSchemaExtensionId() == null ^ this.getSchemaExtensionId() == null)
            return false;
        if (other.getSchemaExtensionId() != null && other.getSchemaExtensionId().equals(this.getSchemaExtensionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSchemaExtensionId() == null) ? 0 : getSchemaExtensionId().hashCode());
        return hashCode;
    }

    @Override
    public CancelSchemaExtensionRequest clone() {
        return (CancelSchemaExtensionRequest) super.clone();
    }

}
