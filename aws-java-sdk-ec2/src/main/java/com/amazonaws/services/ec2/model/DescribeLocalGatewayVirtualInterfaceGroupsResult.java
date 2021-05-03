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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewayVirtualInterfaceGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LocalGatewayVirtualInterfaceGroup> localGatewayVirtualInterfaceGroups;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     * 
     * @return The virtual interface groups.
     */

    public java.util.List<LocalGatewayVirtualInterfaceGroup> getLocalGatewayVirtualInterfaceGroups() {
        if (localGatewayVirtualInterfaceGroups == null) {
            localGatewayVirtualInterfaceGroups = new com.amazonaws.internal.SdkInternalList<LocalGatewayVirtualInterfaceGroup>();
        }
        return localGatewayVirtualInterfaceGroups;
    }

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroups
     *        The virtual interface groups.
     */

    public void setLocalGatewayVirtualInterfaceGroups(java.util.Collection<LocalGatewayVirtualInterfaceGroup> localGatewayVirtualInterfaceGroups) {
        if (localGatewayVirtualInterfaceGroups == null) {
            this.localGatewayVirtualInterfaceGroups = null;
            return;
        }

        this.localGatewayVirtualInterfaceGroups = new com.amazonaws.internal.SdkInternalList<LocalGatewayVirtualInterfaceGroup>(
                localGatewayVirtualInterfaceGroups);
    }

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalGatewayVirtualInterfaceGroups(java.util.Collection)} or
     * {@link #withLocalGatewayVirtualInterfaceGroups(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroups
     *        The virtual interface groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayVirtualInterfaceGroupsResult withLocalGatewayVirtualInterfaceGroups(
            LocalGatewayVirtualInterfaceGroup... localGatewayVirtualInterfaceGroups) {
        if (this.localGatewayVirtualInterfaceGroups == null) {
            setLocalGatewayVirtualInterfaceGroups(new com.amazonaws.internal.SdkInternalList<LocalGatewayVirtualInterfaceGroup>(
                    localGatewayVirtualInterfaceGroups.length));
        }
        for (LocalGatewayVirtualInterfaceGroup ele : localGatewayVirtualInterfaceGroups) {
            this.localGatewayVirtualInterfaceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroups
     *        The virtual interface groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayVirtualInterfaceGroupsResult withLocalGatewayVirtualInterfaceGroups(
            java.util.Collection<LocalGatewayVirtualInterfaceGroup> localGatewayVirtualInterfaceGroups) {
        setLocalGatewayVirtualInterfaceGroups(localGatewayVirtualInterfaceGroups);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayVirtualInterfaceGroupsResult withNextToken(String nextToken) {
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
        if (getLocalGatewayVirtualInterfaceGroups() != null)
            sb.append("LocalGatewayVirtualInterfaceGroups: ").append(getLocalGatewayVirtualInterfaceGroups()).append(",");
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

        if (obj instanceof DescribeLocalGatewayVirtualInterfaceGroupsResult == false)
            return false;
        DescribeLocalGatewayVirtualInterfaceGroupsResult other = (DescribeLocalGatewayVirtualInterfaceGroupsResult) obj;
        if (other.getLocalGatewayVirtualInterfaceGroups() == null ^ this.getLocalGatewayVirtualInterfaceGroups() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroups() != null
                && other.getLocalGatewayVirtualInterfaceGroups().equals(this.getLocalGatewayVirtualInterfaceGroups()) == false)
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

        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceGroups() == null) ? 0 : getLocalGatewayVirtualInterfaceGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocalGatewayVirtualInterfaceGroupsResult clone() {
        try {
            return (DescribeLocalGatewayVirtualInterfaceGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
