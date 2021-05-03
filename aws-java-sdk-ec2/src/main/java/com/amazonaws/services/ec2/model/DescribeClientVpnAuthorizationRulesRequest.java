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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeClientVpnAuthorizationRulesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientVpnAuthorizationRulesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeClientVpnAuthorizationRulesRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the nextToken value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnAuthorizationRulesRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnAuthorizationRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. Filter names and values are case-sensitive.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the authorization rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants
     *         access.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the authorization rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants
     *        access.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the authorization rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants
     *        access.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnAuthorizationRulesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the authorization rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the authorization rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destination-cidr</code> - The CIDR of the network to which the authorization rule applies.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of the Active Directory group to which the authorization rule grants
     *        access.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnAuthorizationRulesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the nextToken value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the nextToken value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the nextToken value.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the nextToken value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the nextToken value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the nextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnAuthorizationRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeClientVpnAuthorizationRulesRequest> getDryRunRequest() {
        Request<DescribeClientVpnAuthorizationRulesRequest> request = new DescribeClientVpnAuthorizationRulesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeClientVpnAuthorizationRulesRequest == false)
            return false;
        DescribeClientVpnAuthorizationRulesRequest other = (DescribeClientVpnAuthorizationRulesRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClientVpnAuthorizationRulesRequest clone() {
        return (DescribeClientVpnAuthorizationRulesRequest) super.clone();
    }
}
