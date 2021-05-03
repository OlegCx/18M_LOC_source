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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status of an account's relationship with the
     * administrator account. By default, the response includes only current member accounts. To include all accounts,
     * set this value to false.
     * </p>
     */
    private String onlyAssociated;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of a paginated response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     * 
     * @return The maximum number of items to include in each page of a paginated response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @return The nextToken string that specifies which page of results to return in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status of an account's relationship with the
     * administrator account. By default, the response includes only current member accounts. To include all accounts,
     * set this value to false.
     * </p>
     * 
     * @param onlyAssociated
     *        Specifies which accounts to include in the response, based on the status of an account's relationship with
     *        the administrator account. By default, the response includes only current member accounts. To include all
     *        accounts, set this value to false.
     */

    public void setOnlyAssociated(String onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
    }

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status of an account's relationship with the
     * administrator account. By default, the response includes only current member accounts. To include all accounts,
     * set this value to false.
     * </p>
     * 
     * @return Specifies which accounts to include in the response, based on the status of an account's relationship
     *         with the administrator account. By default, the response includes only current member accounts. To
     *         include all accounts, set this value to false.
     */

    public String getOnlyAssociated() {
        return this.onlyAssociated;
    }

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status of an account's relationship with the
     * administrator account. By default, the response includes only current member accounts. To include all accounts,
     * set this value to false.
     * </p>
     * 
     * @param onlyAssociated
     *        Specifies which accounts to include in the response, based on the status of an account's relationship with
     *        the administrator account. By default, the response includes only current member accounts. To include all
     *        accounts, set this value to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withOnlyAssociated(String onlyAssociated) {
        setOnlyAssociated(onlyAssociated);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOnlyAssociated() != null)
            sb.append("OnlyAssociated: ").append(getOnlyAssociated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOnlyAssociated() == null ^ this.getOnlyAssociated() == null)
            return false;
        if (other.getOnlyAssociated() != null && other.getOnlyAssociated().equals(this.getOnlyAssociated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOnlyAssociated() == null) ? 0 : getOnlyAssociated().hashCode());
        return hashCode;
    }

    @Override
    public ListMembersRequest clone() {
        return (ListMembersRequest) super.clone();
    }

}
