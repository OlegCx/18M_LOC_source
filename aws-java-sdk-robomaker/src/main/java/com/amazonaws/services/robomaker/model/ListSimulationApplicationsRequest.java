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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSimulationApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The version qualifier of the simulation application.
     * </p>
     */
    private String versionQualifier;
    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListSimulationApplications</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>ListSimulationApplications</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Optional list of filters to limit results.
     * </p>
     * <p>
     * The filter name <code>name</code> is supported. When filtering, you must use the complete value of the filtered
     * item. You can use up to three filters.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The version qualifier of the simulation application.
     * </p>
     * 
     * @param versionQualifier
     *        The version qualifier of the simulation application.
     */

    public void setVersionQualifier(String versionQualifier) {
        this.versionQualifier = versionQualifier;
    }

    /**
     * <p>
     * The version qualifier of the simulation application.
     * </p>
     * 
     * @return The version qualifier of the simulation application.
     */

    public String getVersionQualifier() {
        return this.versionQualifier;
    }

    /**
     * <p>
     * The version qualifier of the simulation application.
     * </p>
     * 
     * @param versionQualifier
     *        The version qualifier of the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationApplicationsRequest withVersionQualifier(String versionQualifier) {
        setVersionQualifier(versionQualifier);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListSimulationApplications</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListSimulationApplications</code> again and assign that token to the request object's
     *        <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *        NextToken parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListSimulationApplications</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListSimulationApplications</code> again and assign that token to the request object's
     *         <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *         NextToken parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListSimulationApplications</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListSimulationApplications</code> again and assign that token to the request object's
     *        <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *        NextToken parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>ListSimulationApplications</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListSimulationApplications</code> request with
     *        the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not
     *        used, then <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code>
     *        value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>ListSimulationApplications</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @return When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code>
     *         results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another <code>ListSimulationApplications</code> request with
     *         the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not
     *         used, then <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code>
     *         value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>ListSimulationApplications</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        When this parameter is used, <code>ListSimulationApplications</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListSimulationApplications</code> request with
     *        the returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not
     *        used, then <code>ListSimulationApplications</code> returns up to 100 results and a <code>nextToken</code>
     *        value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationApplicationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Optional list of filters to limit results.
     * </p>
     * <p>
     * The filter name <code>name</code> is supported. When filtering, you must use the complete value of the filtered
     * item. You can use up to three filters.
     * </p>
     * 
     * @return Optional list of filters to limit results.</p>
     *         <p>
     *         The filter name <code>name</code> is supported. When filtering, you must use the complete value of the
     *         filtered item. You can use up to three filters.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Optional list of filters to limit results.
     * </p>
     * <p>
     * The filter name <code>name</code> is supported. When filtering, you must use the complete value of the filtered
     * item. You can use up to three filters.
     * </p>
     * 
     * @param filters
     *        Optional list of filters to limit results.</p>
     *        <p>
     *        The filter name <code>name</code> is supported. When filtering, you must use the complete value of the
     *        filtered item. You can use up to three filters.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Optional list of filters to limit results.
     * </p>
     * <p>
     * The filter name <code>name</code> is supported. When filtering, you must use the complete value of the filtered
     * item. You can use up to three filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Optional list of filters to limit results.</p>
     *        <p>
     *        The filter name <code>name</code> is supported. When filtering, you must use the complete value of the
     *        filtered item. You can use up to three filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationApplicationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional list of filters to limit results.
     * </p>
     * <p>
     * The filter name <code>name</code> is supported. When filtering, you must use the complete value of the filtered
     * item. You can use up to three filters.
     * </p>
     * 
     * @param filters
     *        Optional list of filters to limit results.</p>
     *        <p>
     *        The filter name <code>name</code> is supported. When filtering, you must use the complete value of the
     *        filtered item. You can use up to three filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationApplicationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getVersionQualifier() != null)
            sb.append("VersionQualifier: ").append(getVersionQualifier()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSimulationApplicationsRequest == false)
            return false;
        ListSimulationApplicationsRequest other = (ListSimulationApplicationsRequest) obj;
        if (other.getVersionQualifier() == null ^ this.getVersionQualifier() == null)
            return false;
        if (other.getVersionQualifier() != null && other.getVersionQualifier().equals(this.getVersionQualifier()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionQualifier() == null) ? 0 : getVersionQualifier().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListSimulationApplicationsRequest clone() {
        return (ListSimulationApplicationsRequest) super.clone();
    }

}
