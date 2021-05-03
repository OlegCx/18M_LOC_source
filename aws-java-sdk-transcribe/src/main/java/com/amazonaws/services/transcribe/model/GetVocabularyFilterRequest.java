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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVocabularyFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary filter for which to return information.
     * </p>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The name of the vocabulary filter for which to return information.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter for which to return information.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter for which to return information.
     * </p>
     * 
     * @return The name of the vocabulary filter for which to return information.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter for which to return information.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter for which to return information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVocabularyFilterRequest withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVocabularyFilterRequest == false)
            return false;
        GetVocabularyFilterRequest other = (GetVocabularyFilterRequest) obj;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        return hashCode;
    }

    @Override
    public GetVocabularyFilterRequest clone() {
        return (GetVocabularyFilterRequest) super.clone();
    }

}
