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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSystemInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>, <code>STATUS</code>,
     * and <code>GREENGRASS_GROUP_NAME</code>.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     */
    private java.util.List<SystemInstanceFilter> filters;
    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>, <code>STATUS</code>,
     * and <code>GREENGRASS_GROUP_NAME</code>.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * 
     * @return Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>,
     *         <code>STATUS</code>, and <code>GREENGRASS_GROUP_NAME</code>.</p>
     *         <p>
     *         Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *         as AND criteria.
     */

    public java.util.List<SystemInstanceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>, <code>STATUS</code>,
     * and <code>GREENGRASS_GROUP_NAME</code>.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * 
     * @param filters
     *        Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>,
     *        <code>STATUS</code>, and <code>GREENGRASS_GROUP_NAME</code>.</p>
     *        <p>
     *        Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *        as AND criteria.
     */

    public void setFilters(java.util.Collection<SystemInstanceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SystemInstanceFilter>(filters);
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>, <code>STATUS</code>,
     * and <code>GREENGRASS_GROUP_NAME</code>.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>,
     *        <code>STATUS</code>, and <code>GREENGRASS_GROUP_NAME</code>.</p>
     *        <p>
     *        Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *        as AND criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSystemInstancesRequest withFilters(SystemInstanceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SystemInstanceFilter>(filters.length));
        }
        for (SystemInstanceFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>, <code>STATUS</code>,
     * and <code>GREENGRASS_GROUP_NAME</code>.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * 
     * @param filters
     *        Optional filter to apply to the search. Valid filters are <code>SYSTEM_TEMPLATE_ID</code>,
     *        <code>STATUS</code>, and <code>GREENGRASS_GROUP_NAME</code>.</p>
     *        <p>
     *        Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *        as AND criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSystemInstancesRequest withFilters(java.util.Collection<SystemInstanceFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @return The string that specifies the next page of results. Use this when you're paginating results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSystemInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSystemInstancesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof SearchSystemInstancesRequest == false)
            return false;
        SearchSystemInstancesRequest other = (SearchSystemInstancesRequest) obj;
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchSystemInstancesRequest clone() {
        return (SearchSystemInstancesRequest) super.clone();
    }

}
