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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to generate a <a>ClientCertificate</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateClientCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the <a>ClientCertificate</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The description of the <a>ClientCertificate</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>ClientCertificate</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>ClientCertificate</a>.
     * </p>
     * 
     * @return The description of the <a>ClientCertificate</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <a>ClientCertificate</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>ClientCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateClientCertificateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * 
     * @return The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *         characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * 
     * @param tags
     *        The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *        characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * 
     * @param tags
     *        The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *        characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateClientCertificateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GenerateClientCertificateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GenerateClientCertificateRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateClientCertificateRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateClientCertificateRequest == false)
            return false;
        GenerateClientCertificateRequest other = (GenerateClientCertificateRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GenerateClientCertificateRequest clone() {
        return (GenerateClientCertificateRequest) super.clone();
    }

}
