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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableManagementCidrRangesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> managementCidrRanges;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * </p>
     * 
     * @return The list of available IP address ranges, specified as IPv4 CIDR blocks.
     */

    public java.util.List<String> getManagementCidrRanges() {
        if (managementCidrRanges == null) {
            managementCidrRanges = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return managementCidrRanges;
    }

    /**
     * <p>
     * The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * </p>
     * 
     * @param managementCidrRanges
     *        The list of available IP address ranges, specified as IPv4 CIDR blocks.
     */

    public void setManagementCidrRanges(java.util.Collection<String> managementCidrRanges) {
        if (managementCidrRanges == null) {
            this.managementCidrRanges = null;
            return;
        }

        this.managementCidrRanges = new com.amazonaws.internal.SdkInternalList<String>(managementCidrRanges);
    }

    /**
     * <p>
     * The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagementCidrRanges(java.util.Collection)} or {@link #withManagementCidrRanges(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param managementCidrRanges
     *        The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagementCidrRangesResult withManagementCidrRanges(String... managementCidrRanges) {
        if (this.managementCidrRanges == null) {
            setManagementCidrRanges(new com.amazonaws.internal.SdkInternalList<String>(managementCidrRanges.length));
        }
        for (String ele : managementCidrRanges) {
            this.managementCidrRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * </p>
     * 
     * @param managementCidrRanges
     *        The list of available IP address ranges, specified as IPv4 CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagementCidrRangesResult withManagementCidrRanges(java.util.Collection<String> managementCidrRanges) {
        setManagementCidrRanges(managementCidrRanges);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagementCidrRangesResult withNextToken(String nextToken) {
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
        if (getManagementCidrRanges() != null)
            sb.append("ManagementCidrRanges: ").append(getManagementCidrRanges()).append(",");
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

        if (obj instanceof ListAvailableManagementCidrRangesResult == false)
            return false;
        ListAvailableManagementCidrRangesResult other = (ListAvailableManagementCidrRangesResult) obj;
        if (other.getManagementCidrRanges() == null ^ this.getManagementCidrRanges() == null)
            return false;
        if (other.getManagementCidrRanges() != null && other.getManagementCidrRanges().equals(this.getManagementCidrRanges()) == false)
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

        hashCode = prime * hashCode + ((getManagementCidrRanges() == null) ? 0 : getManagementCidrRanges().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableManagementCidrRangesResult clone() {
        try {
            return (ListAvailableManagementCidrRangesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
