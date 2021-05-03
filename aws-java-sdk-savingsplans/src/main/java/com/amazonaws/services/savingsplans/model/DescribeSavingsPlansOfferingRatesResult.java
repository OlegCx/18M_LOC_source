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
package com.amazonaws.services.savingsplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferingRates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSavingsPlansOfferingRatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the Savings Plans offering rates.
     * </p>
     */
    private java.util.List<SavingsPlanOfferingRate> searchResults;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Savings Plans offering rates.
     * </p>
     * 
     * @return Information about the Savings Plans offering rates.
     */

    public java.util.List<SavingsPlanOfferingRate> getSearchResults() {
        return searchResults;
    }

    /**
     * <p>
     * Information about the Savings Plans offering rates.
     * </p>
     * 
     * @param searchResults
     *        Information about the Savings Plans offering rates.
     */

    public void setSearchResults(java.util.Collection<SavingsPlanOfferingRate> searchResults) {
        if (searchResults == null) {
            this.searchResults = null;
            return;
        }

        this.searchResults = new java.util.ArrayList<SavingsPlanOfferingRate>(searchResults);
    }

    /**
     * <p>
     * Information about the Savings Plans offering rates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearchResults(java.util.Collection)} or {@link #withSearchResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param searchResults
     *        Information about the Savings Plans offering rates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingRatesResult withSearchResults(SavingsPlanOfferingRate... searchResults) {
        if (this.searchResults == null) {
            setSearchResults(new java.util.ArrayList<SavingsPlanOfferingRate>(searchResults.length));
        }
        for (SavingsPlanOfferingRate ele : searchResults) {
            this.searchResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Savings Plans offering rates.
     * </p>
     * 
     * @param searchResults
     *        Information about the Savings Plans offering rates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingRatesResult withSearchResults(java.util.Collection<SavingsPlanOfferingRate> searchResults) {
        setSearchResults(searchResults);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingRatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSearchResults() != null)
            sb.append("SearchResults: ").append(getSearchResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSavingsPlansOfferingRatesResult == false)
            return false;
        DescribeSavingsPlansOfferingRatesResult other = (DescribeSavingsPlansOfferingRatesResult) obj;
        if (other.getSearchResults() == null ^ this.getSearchResults() == null)
            return false;
        if (other.getSearchResults() != null && other.getSearchResults().equals(this.getSearchResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSearchResults() == null) ? 0 : getSearchResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSavingsPlansOfferingRatesResult clone() {
        try {
            return (DescribeSavingsPlansOfferingRatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
