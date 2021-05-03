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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request for usage information on an identity pool.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListIdentityPoolUsage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityPoolUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A pagination token for obtaining the next page of results. */
    private String nextToken;
    /** The maximum number of results to be returned. */
    private Integer maxResults;

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @return A pagination token for obtaining the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @return The maximum number of results to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListIdentityPoolUsageRequest == false)
            return false;
        ListIdentityPoolUsageRequest other = (ListIdentityPoolUsageRequest) obj;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentityPoolUsageRequest clone() {
        return (ListIdentityPoolUsageRequest) super.clone();
    }

}
