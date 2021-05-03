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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the behavior graph for which to retrieve the list of member accounts.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * For requests to retrieve the next page of member account results, the pagination token that was returned with the
     * previous page of results. The initial request does not include a pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of member accounts to include in the response. The total must be less than the overall limit
     * on the number of results to return, which is currently 200.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the behavior graph for which to retrieve the list of member accounts.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph for which to retrieve the list of member accounts.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph for which to retrieve the list of member accounts.
     * </p>
     * 
     * @return The ARN of the behavior graph for which to retrieve the list of member accounts.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph for which to retrieve the list of member accounts.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph for which to retrieve the list of member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * For requests to retrieve the next page of member account results, the pagination token that was returned with the
     * previous page of results. The initial request does not include a pagination token.
     * </p>
     * 
     * @param nextToken
     *        For requests to retrieve the next page of member account results, the pagination token that was returned
     *        with the previous page of results. The initial request does not include a pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For requests to retrieve the next page of member account results, the pagination token that was returned with the
     * previous page of results. The initial request does not include a pagination token.
     * </p>
     * 
     * @return For requests to retrieve the next page of member account results, the pagination token that was returned
     *         with the previous page of results. The initial request does not include a pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For requests to retrieve the next page of member account results, the pagination token that was returned with the
     * previous page of results. The initial request does not include a pagination token.
     * </p>
     * 
     * @param nextToken
     *        For requests to retrieve the next page of member account results, the pagination token that was returned
     *        with the previous page of results. The initial request does not include a pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of member accounts to include in the response. The total must be less than the overall limit
     * on the number of results to return, which is currently 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of member accounts to include in the response. The total must be less than the overall
     *        limit on the number of results to return, which is currently 200.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of member accounts to include in the response. The total must be less than the overall limit
     * on the number of results to return, which is currently 200.
     * </p>
     * 
     * @return The maximum number of member accounts to include in the response. The total must be less than the overall
     *         limit on the number of results to return, which is currently 200.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of member accounts to include in the response. The total must be less than the overall limit
     * on the number of results to return, which is currently 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of member accounts to include in the response. The total must be less than the overall
     *        limit on the number of results to return, which is currently 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withMaxResults(Integer maxResults) {
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
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

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
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

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMembersRequest clone() {
        return (ListMembersRequest) super.clone();
    }

}
