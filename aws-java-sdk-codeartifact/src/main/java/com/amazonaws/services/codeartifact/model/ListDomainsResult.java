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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListDomains" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html">DomainSummary</a>
     * objects.
     * </p>
     */
    private java.util.List<DomainSummary> domains;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html">DomainSummary</a>
     * objects.
     * </p>
     * 
     * @return The returned list of <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html"
     *         >DomainSummary</a> objects.
     */

    public java.util.List<DomainSummary> getDomains() {
        return domains;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html">DomainSummary</a>
     * objects.
     * </p>
     * 
     * @param domains
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html"
     *        >DomainSummary</a> objects.
     */

    public void setDomains(java.util.Collection<DomainSummary> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<DomainSummary>(domains);
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html">DomainSummary</a>
     * objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html"
     *        >DomainSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withDomains(DomainSummary... domains) {
        if (this.domains == null) {
            setDomains(new java.util.ArrayList<DomainSummary>(domains.length));
        }
        for (DomainSummary ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html">DomainSummary</a>
     * objects.
     * </p>
     * 
     * @param domains
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainSummary.html"
     *        >DomainSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withDomains(java.util.Collection<DomainSummary> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withNextToken(String nextToken) {
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
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains()).append(",");
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

        if (obj instanceof ListDomainsResult == false)
            return false;
        ListDomainsResult other = (ListDomainsResult) obj;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
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

        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainsResult clone() {
        try {
            return (ListDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
