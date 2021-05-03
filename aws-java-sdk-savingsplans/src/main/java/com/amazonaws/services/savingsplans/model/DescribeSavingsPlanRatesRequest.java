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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlanRates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSavingsPlanRatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     */
    private String savingsPlanId;
    /**
     * <p>
     * The filters.
     * </p>
     */
    private java.util.List<SavingsPlanRateFilter> filters;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     * 
     * @param savingsPlanId
     *        The ID of the Savings Plan.
     */

    public void setSavingsPlanId(String savingsPlanId) {
        this.savingsPlanId = savingsPlanId;
    }

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     * 
     * @return The ID of the Savings Plan.
     */

    public String getSavingsPlanId() {
        return this.savingsPlanId;
    }

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     * 
     * @param savingsPlanId
     *        The ID of the Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlanRatesRequest withSavingsPlanId(String savingsPlanId) {
        setSavingsPlanId(savingsPlanId);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @return The filters.
     */

    public java.util.List<SavingsPlanRateFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     */

    public void setFilters(java.util.Collection<SavingsPlanRateFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SavingsPlanRateFilter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlanRatesRequest withFilters(SavingsPlanRateFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SavingsPlanRateFilter>(filters.length));
        }
        for (SavingsPlanRateFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlanRatesRequest withFilters(java.util.Collection<SavingsPlanRateFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlanRatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve additional results, make another
     *        call with the returned token value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve additional results, make another
     *         call with the returned token value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve additional results, make another
     *        call with the returned token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlanRatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSavingsPlanId() != null)
            sb.append("SavingsPlanId: ").append(getSavingsPlanId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSavingsPlanRatesRequest == false)
            return false;
        DescribeSavingsPlanRatesRequest other = (DescribeSavingsPlanRatesRequest) obj;
        if (other.getSavingsPlanId() == null ^ this.getSavingsPlanId() == null)
            return false;
        if (other.getSavingsPlanId() != null && other.getSavingsPlanId().equals(this.getSavingsPlanId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsPlanId() == null) ? 0 : getSavingsPlanId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSavingsPlanRatesRequest clone() {
        return (DescribeSavingsPlanRatesRequest) super.clone();
    }

}
