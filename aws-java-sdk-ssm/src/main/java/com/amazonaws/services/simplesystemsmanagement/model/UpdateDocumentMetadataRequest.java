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

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDocumentMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the document for which a version is to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of a document to update.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The document review details to update.
     * </p>
     */
    private DocumentReviews documentReviews;

    /**
     * <p>
     * The name of the document for which a version is to be updated.
     * </p>
     * 
     * @param name
     *        The name of the document for which a version is to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document for which a version is to be updated.
     * </p>
     * 
     * @return The name of the document for which a version is to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document for which a version is to be updated.
     * </p>
     * 
     * @param name
     *        The name of the document for which a version is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentMetadataRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of a document to update.
     * </p>
     * 
     * @param documentVersion
     *        The version of a document to update.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of a document to update.
     * </p>
     * 
     * @return The version of a document to update.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of a document to update.
     * </p>
     * 
     * @param documentVersion
     *        The version of a document to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentMetadataRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The document review details to update.
     * </p>
     * 
     * @param documentReviews
     *        The document review details to update.
     */

    public void setDocumentReviews(DocumentReviews documentReviews) {
        this.documentReviews = documentReviews;
    }

    /**
     * <p>
     * The document review details to update.
     * </p>
     * 
     * @return The document review details to update.
     */

    public DocumentReviews getDocumentReviews() {
        return this.documentReviews;
    }

    /**
     * <p>
     * The document review details to update.
     * </p>
     * 
     * @param documentReviews
     *        The document review details to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentMetadataRequest withDocumentReviews(DocumentReviews documentReviews) {
        setDocumentReviews(documentReviews);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getDocumentReviews() != null)
            sb.append("DocumentReviews: ").append(getDocumentReviews());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentMetadataRequest == false)
            return false;
        UpdateDocumentMetadataRequest other = (UpdateDocumentMetadataRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDocumentReviews() == null ^ this.getDocumentReviews() == null)
            return false;
        if (other.getDocumentReviews() != null && other.getDocumentReviews().equals(this.getDocumentReviews()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentReviews() == null) ? 0 : getDocumentReviews().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentMetadataRequest clone() {
        return (UpdateDocumentMetadataRequest) super.clone();
    }

}
