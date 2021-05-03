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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePacks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConformancePacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of <code>ConformancePackDetail</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackDetail> conformancePackDetails;
    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of <code>ConformancePackDetail</code> objects.
     * </p>
     * 
     * @return Returns a list of <code>ConformancePackDetail</code> objects.
     */

    public java.util.List<ConformancePackDetail> getConformancePackDetails() {
        if (conformancePackDetails == null) {
            conformancePackDetails = new com.amazonaws.internal.SdkInternalList<ConformancePackDetail>();
        }
        return conformancePackDetails;
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackDetail</code> objects.
     * </p>
     * 
     * @param conformancePackDetails
     *        Returns a list of <code>ConformancePackDetail</code> objects.
     */

    public void setConformancePackDetails(java.util.Collection<ConformancePackDetail> conformancePackDetails) {
        if (conformancePackDetails == null) {
            this.conformancePackDetails = null;
            return;
        }

        this.conformancePackDetails = new com.amazonaws.internal.SdkInternalList<ConformancePackDetail>(conformancePackDetails);
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackDetail</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackDetails(java.util.Collection)} or
     * {@link #withConformancePackDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackDetails
     *        Returns a list of <code>ConformancePackDetail</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePacksResult withConformancePackDetails(ConformancePackDetail... conformancePackDetails) {
        if (this.conformancePackDetails == null) {
            setConformancePackDetails(new com.amazonaws.internal.SdkInternalList<ConformancePackDetail>(conformancePackDetails.length));
        }
        for (ConformancePackDetail ele : conformancePackDetails) {
            this.conformancePackDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackDetail</code> objects.
     * </p>
     * 
     * @param conformancePackDetails
     *        Returns a list of <code>ConformancePackDetail</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePacksResult withConformancePackDetails(java.util.Collection<ConformancePackDetail> conformancePackDetails) {
        setConformancePackDetails(conformancePackDetails);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePacksResult withNextToken(String nextToken) {
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
        if (getConformancePackDetails() != null)
            sb.append("ConformancePackDetails: ").append(getConformancePackDetails()).append(",");
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

        if (obj instanceof DescribeConformancePacksResult == false)
            return false;
        DescribeConformancePacksResult other = (DescribeConformancePacksResult) obj;
        if (other.getConformancePackDetails() == null ^ this.getConformancePackDetails() == null)
            return false;
        if (other.getConformancePackDetails() != null && other.getConformancePackDetails().equals(this.getConformancePackDetails()) == false)
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

        hashCode = prime * hashCode + ((getConformancePackDetails() == null) ? 0 : getConformancePackDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConformancePacksResult clone() {
        try {
            return (DescribeConformancePacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
