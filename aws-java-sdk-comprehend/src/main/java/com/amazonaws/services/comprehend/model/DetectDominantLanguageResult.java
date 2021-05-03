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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectDominantLanguageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC
     * 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For
     * more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     */
    private java.util.List<DominantLanguage> languages;

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC
     * 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For
     * more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @return The languages that Amazon Comprehend detected in the input text. For each language, the response returns
     *         the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its
     *         inference. For more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags
     *         for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     */

    public java.util.List<DominantLanguage> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC
     * 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For
     * more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languages
     *        The languages that Amazon Comprehend detected in the input text. For each language, the response returns
     *        the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its
     *        inference. For more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for
     *        Identifying Languages</a> on the <i>IETF Tools</i> web site.
     */

    public void setLanguages(java.util.Collection<DominantLanguage> languages) {
        if (languages == null) {
            this.languages = null;
            return;
        }

        this.languages = new java.util.ArrayList<DominantLanguage>(languages);
    }

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC
     * 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For
     * more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguages(java.util.Collection)} or {@link #withLanguages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param languages
     *        The languages that Amazon Comprehend detected in the input text. For each language, the response returns
     *        the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its
     *        inference. For more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for
     *        Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectDominantLanguageResult withLanguages(DominantLanguage... languages) {
        if (this.languages == null) {
            setLanguages(new java.util.ArrayList<DominantLanguage>(languages.length));
        }
        for (DominantLanguage ele : languages) {
            this.languages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC
     * 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For
     * more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languages
     *        The languages that Amazon Comprehend detected in the input text. For each language, the response returns
     *        the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its
     *        inference. For more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for
     *        Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectDominantLanguageResult withLanguages(java.util.Collection<DominantLanguage> languages) {
        setLanguages(languages);
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
        if (getLanguages() != null)
            sb.append("Languages: ").append(getLanguages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDominantLanguageResult == false)
            return false;
        DetectDominantLanguageResult other = (DetectDominantLanguageResult) obj;
        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        return hashCode;
    }

    @Override
    public DetectDominantLanguageResult clone() {
        try {
            return (DetectDominantLanguageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
