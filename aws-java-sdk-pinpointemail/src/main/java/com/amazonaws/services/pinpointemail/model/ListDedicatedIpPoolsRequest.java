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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to obtain a list of dedicated IP pools.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDedicatedIpPools"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDedicatedIpPoolsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in the list
     * of dedicated IP pools.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in the list
     * of dedicated IP pools.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in the
     *        list of dedicated IP pools.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in the list
     * of dedicated IP pools.
     * </p>
     * 
     * @return A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in
     *         the list of dedicated IP pools.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in the list
     * of dedicated IP pools.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListDedicatedIpPools</code> to indicate the position in the
     *        list of dedicated IP pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDedicatedIpPoolsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * 
     * @param pageSize
     *        The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of
     *        results is larger than the number you specified in this parameter, then the response includes a
     *        <code>NextToken</code> element, which you can use to obtain additional results.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * 
     * @return The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of
     *         results is larger than the number you specified in this parameter, then the response includes a
     *         <code>NextToken</code> element, which you can use to obtain additional results.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * 
     * @param pageSize
     *        The number of results to show in a single call to <code>ListDedicatedIpPools</code>. If the number of
     *        results is larger than the number you specified in this parameter, then the response includes a
     *        <code>NextToken</code> element, which you can use to obtain additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDedicatedIpPoolsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDedicatedIpPoolsRequest == false)
            return false;
        ListDedicatedIpPoolsRequest other = (ListDedicatedIpPoolsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListDedicatedIpPoolsRequest clone() {
        return (ListDedicatedIpPoolsRequest) super.clone();
    }

}
