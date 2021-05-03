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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectConnectGatewayAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     */
    private String associatedGatewayId;
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * 
     * @param associationId
     *        The ID of the Direct Connect gateway association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * 
     * @param associationId
     *        The ID of the Direct Connect gateway association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * 
     * @param associatedGatewayId
     *        The ID of the associated gateway.
     */

    public void setAssociatedGatewayId(String associatedGatewayId) {
        this.associatedGatewayId = associatedGatewayId;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * 
     * @return The ID of the associated gateway.
     */

    public String getAssociatedGatewayId() {
        return this.associatedGatewayId;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * 
     * @param associatedGatewayId
     *        The ID of the associated gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withAssociatedGatewayId(String associatedGatewayId) {
        setAssociatedGatewayId(associatedGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.</p>
     *        <p>
     *        If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.</p>
     *         <p>
     *         If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.</p>
     *        <p>
     *        If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        The token provided in the previous call to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     * 
     * @return The token provided in the previous call to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        The token provided in the previous call to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway or transit gateway.
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway or transit gateway.
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway or transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAssociatedGatewayId() != null)
            sb.append("AssociatedGatewayId: ").append(getAssociatedGatewayId()).append(",");
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAssociationsRequest == false)
            return false;
        DescribeDirectConnectGatewayAssociationsRequest other = (DescribeDirectConnectGatewayAssociationsRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociatedGatewayId() == null ^ this.getAssociatedGatewayId() == null)
            return false;
        if (other.getAssociatedGatewayId() != null && other.getAssociatedGatewayId().equals(this.getAssociatedGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedGatewayId() == null) ? 0 : getAssociatedGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectConnectGatewayAssociationsRequest clone() {
        return (DescribeDirectConnectGatewayAssociationsRequest) super.clone();
    }

}
