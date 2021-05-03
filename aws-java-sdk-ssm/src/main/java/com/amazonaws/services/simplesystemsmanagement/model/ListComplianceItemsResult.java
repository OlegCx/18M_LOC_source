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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComplianceItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ComplianceItem> complianceItems;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     * 
     * @return A list of compliance information for the specified resource ID.
     */

    public java.util.List<ComplianceItem> getComplianceItems() {
        if (complianceItems == null) {
            complianceItems = new com.amazonaws.internal.SdkInternalList<ComplianceItem>();
        }
        return complianceItems;
    }

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     * 
     * @param complianceItems
     *        A list of compliance information for the specified resource ID.
     */

    public void setComplianceItems(java.util.Collection<ComplianceItem> complianceItems) {
        if (complianceItems == null) {
            this.complianceItems = null;
            return;
        }

        this.complianceItems = new com.amazonaws.internal.SdkInternalList<ComplianceItem>(complianceItems);
    }

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceItems(java.util.Collection)} or {@link #withComplianceItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param complianceItems
     *        A list of compliance information for the specified resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsResult withComplianceItems(ComplianceItem... complianceItems) {
        if (this.complianceItems == null) {
            setComplianceItems(new com.amazonaws.internal.SdkInternalList<ComplianceItem>(complianceItems.length));
        }
        for (ComplianceItem ele : complianceItems) {
            this.complianceItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     * 
     * @param complianceItems
     *        A list of compliance information for the specified resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsResult withComplianceItems(java.util.Collection<ComplianceItem> complianceItems) {
        setComplianceItems(complianceItems);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsResult withNextToken(String nextToken) {
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
        if (getComplianceItems() != null)
            sb.append("ComplianceItems: ").append(getComplianceItems()).append(",");
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

        if (obj instanceof ListComplianceItemsResult == false)
            return false;
        ListComplianceItemsResult other = (ListComplianceItemsResult) obj;
        if (other.getComplianceItems() == null ^ this.getComplianceItems() == null)
            return false;
        if (other.getComplianceItems() != null && other.getComplianceItems().equals(this.getComplianceItems()) == false)
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

        hashCode = prime * hashCode + ((getComplianceItems() == null) ? 0 : getComplianceItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComplianceItemsResult clone() {
        try {
            return (ListComplianceItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
