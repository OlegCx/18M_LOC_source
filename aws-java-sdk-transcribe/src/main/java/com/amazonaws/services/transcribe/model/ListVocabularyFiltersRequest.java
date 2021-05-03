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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVocabularyFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of collections.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of filters to return in the response. If there are fewer results in the list, this response
     * contains only the actual results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
     * </p>
     */
    private String nameContains;

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of collections.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     *        <code>NextToken</code> to fetch the next set of collections.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of collections.
     * </p>
     * 
     * @return If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     *         <code>NextToken</code> to fetch the next set of collections.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of collections.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request to <code>ListVocabularyFilters</code> was truncated, include the
     *        <code>NextToken</code> to fetch the next set of collections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabularyFiltersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of filters to return in the response. If there are fewer results in the list, this response
     * contains only the actual results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of filters to return in the response. If there are fewer results in the list, this
     *        response contains only the actual results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of filters to return in the response. If there are fewer results in the list, this response
     * contains only the actual results.
     * </p>
     * 
     * @return The maximum number of filters to return in the response. If there are fewer results in the list, this
     *         response contains only the actual results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of filters to return in the response. If there are fewer results in the list, this response
     * contains only the actual results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of filters to return in the response. If there are fewer results in the list, this
     *        response contains only the actual results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabularyFiltersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        Filters the response so that it only contains vocabulary filters whose name contains the specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
     * </p>
     * 
     * @return Filters the response so that it only contains vocabulary filters whose name contains the specified
     *         string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        Filters the response so that it only contains vocabulary filters whose name contains the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabularyFiltersRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVocabularyFiltersRequest == false)
            return false;
        ListVocabularyFiltersRequest other = (ListVocabularyFiltersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public ListVocabularyFiltersRequest clone() {
        return (ListVocabularyFiltersRequest) super.clone();
    }

}
